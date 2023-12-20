package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.hibernate_entity.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static final UserDao userDaoHibernate = new UserDaoHibernateImpl();

    public void createUsersTable() {
        userDaoHibernate.createUsersTable();
        System.out.println("Таблица создана.");
    }

    public void dropUsersTable() {
        userDaoHibernate.dropUsersTable();
        System.out.println("Таблица удалена.");
    }

    public void saveUser(String name, String lastName, Byte age) {
        userDaoHibernate.saveUser(name, lastName, age);
        System.out.println("User с именем – " + name + " добавлен в базу данных");
    }

    public void removeUserById(Long id) {
        userDaoHibernate.removeUserById(id);
        System.out.println("User с id – " + id + " удален из базы данных");
    }

    public List<User> getAllUsers() {
        return userDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoHibernate.cleanUsersTable();
        System.out.println("Таблица очищена.");
    }
}