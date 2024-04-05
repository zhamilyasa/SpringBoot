package org.example.service.impl;

import org.example.dto.UserDto;
import org.example.error.ResourceNotFoundException;
import org.example.mapper.UserMapper;
import org.example.model.entity.User;
import org.example.model.entity.enums.Role;
import org.example.model.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found."));
    }

    @Override
    @Transactional(readOnly = true)
    public User getByUsername(String username) {

        return userRepository.findByUsername(username)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found."));
    }

    @Override
    public User update(User user) {
        if (!userRepository.existsById((long) user.getId())) {
            throw new ResourceNotFoundException("Invalid request!");
        }
        userRepository.save(user);
        return user;
    }

    @Override
    public User create(User user) {
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            throw new IllegalStateException("User already exists.");
        }
        if (user.getPassword() == null || !user.getPassword().equals(user.getPasswordConf())) {
            throw new IllegalStateException(
                    "Password and password confirmation do not match."
            );
        }
        Set<Role> roles = Set.of(Role.USER);
        user.getRole(roles);
        userRepository.save(user);
        return user;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserDto> getAllUserToList() {
        return userMapper.toDto(userRepository.findAll());
    }

    @Override
    public Object getByUsername() {
        return null;
    }

}
