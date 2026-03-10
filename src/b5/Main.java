package b5;

import b1.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("alice", "alice@gmail.com", "ACTIVE"));
        users.add(new User("bob", "bob@yahoo.com", "INACTIVE"));
        users.add(new User("charlie", "charlie@gmail.com", "ACTIVE"));
        users.add(new User("alice", "alice@gmail.com", "ACTIVE"));
        users.add(new User("alexander", "alice@gmail.com", "ACTIVE"));
        users.add(new User("charlotte", "alice@gmail.com", "ACTIVE"));
        users.add(new User("Benjamin", "alice@gmail.com", "ACTIVE"));

        users.stream().sorted(Comparator.comparingInt((User u) -> u.username().length()).reversed())
                .limit(3)
                .map(User::username)
                .forEach(System.out::println);


    }
}
