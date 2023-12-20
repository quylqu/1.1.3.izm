package jm.task.core.jdbc;

import jm.task.core.jdbc.hibernate_entity.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    private static final User userOne = new User("NameOne", "LastNameOne", (byte) 10);
    private static final User userTwo = new User("NameTwo", "LastNameTwo", (byte) 20);
    private static final User userThree = new User("NameThree", "LastNameThree", (byte) 30);
    private static final User userFour = new User("NameFour", "LastNameFour", (byte) 40);

    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser(userOne.getName(), userOne.getLastName(), userOne.getAge());
        userService.saveUser(userTwo.getName(), userTwo.getLastName(), userTwo.getAge());
        userService.saveUser(userThree.getName(), userThree.getLastName(), userThree.getAge());
        userService.saveUser(userFour.getName(), userFour.getLastName(), userFour.getAge());
        userService.getAllUsers();
        userService.removeUserById(3L);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}