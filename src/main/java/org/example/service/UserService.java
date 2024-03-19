package org.example.service;

import org.example.dto.UserDto;
import org.example.model.entity.User;

import java.util.List;

public interface UserService {
    /**
     * Получить пользователя по его идентификатору.
     *
     * @param id идентификатор пользователя
     * @return объект пользователя
     */
    User getById(Long id);

    /**
     * Получить пользователя по его имени пользователя.
     *
     * @param username имя пользователя
     * @return объект пользователя
     */
    User getByUsername(String username);

    /**
     * Обновить информацию о пользователе.
     *
     * @param user объект пользователя для обновления
     * @return обновленный объект пользователя
     */
    User update(User user);

    /**
     * Создать нового пользователя.
     *
     * @param user объект пользователя для создания
     * @return созданный объект пользователя
     */
    User create(User user);

    /**
     * Удалить пользователя по его идентификатору.
     *
     * @param id идентификатор пользователя для удаления
     */
    void delete(Long id);

    List<UserDto> getAllUserToList();
}
