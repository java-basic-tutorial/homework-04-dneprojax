package com.softserveinc.task03;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public class UserManager {
    private final Set<User> users;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserManager that = (UserManager) o;
        return Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    public void register(String login, String password){
       users.add(new User(login, password));

    }

    public void delete(String login){
        users.remove(users);

    }

    public boolean exists(String login, String password) {
        
    }



}
