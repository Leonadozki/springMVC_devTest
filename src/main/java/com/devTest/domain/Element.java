package com.devTest.domain;

import java.util.List;
import java.util.Map;

public class Element {

    private List<User> users;

    private Map<String, User> map;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Element{" +
                "users=" + users +
                ", map=" + map +
                '}';
    }
}
