//package web;
//
//import web.dao.UserDao;
//import web.dao.UserDaoImpl;
//import web.model.User;
//import web.service.CarServiceImpl;
//import web.service.UserService;
//import web.service.UserServiceImpl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        UserDao userDao = new UserDaoImpl();
//
//        UserService userService = new UserServiceImpl(userDao);
//        CarServiceImpl carService = new CarServiceImpl();
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
//        userService.createUsersTable();
//        List<User> users = new ArrayList<>();
//        users.add(new User("Nastya", "Prilepskaya", (byte) 25));
//        users.add(new User("Ivan", "Ivanov", (byte) 21));
//        users.add(new User("Lollipop", "Popovich", (byte) 18));
//        users.add(new User("Vasya", "Loxich", (byte) 26));
//
//        for (User user : users) {
//            userService.saveUser(user.getName(), user.getLastName(), user.getAge());
//            System.out.println("User с именем – " + user.getName() + " добавлен в базу данных");
//        }
//
//        List<User> usersTable = userService.getAllUsers();
//        for (User user : usersTable) {
//            System.out.println(user);
//        }
//
//
//    }
//}
