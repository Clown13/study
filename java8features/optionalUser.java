package java8features;

import java.util.Optional;

class User {
    private String name;
    // Need to set up constructor to initialize the value when object is created.
    public User(String name) {
        this.name = name;
    }
    // Set up getters this is form of encapsulation.
    public String getUser(){
        return name;
    }

}

public class optionalUser {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User(null);

        System.out.println(getUserName(user1));
        System.out.println(getUserName(user2));


    }

    public static String getUserName(User user) {
        Optional<String> userName = Optional.ofNullable(user.getUser());
        String result = userName.orElse("UnknownUser");
        return result;
    }

}
