package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.hibernate_entity.User;
import java.util.List;

public interface UserDao {
    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, Byte age);

    void removeUserById(Long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}