package com.example.P2.service;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class Service {
    List<Map.Entry<String, String>> users = new ArrayList<>();
    public void user(String user, String valu) {
        users.add(new AbstractMap.SimpleEntry<>(user, valu));
        }

    public List<Map.Entry<String, String>> getUsers() {
        return users;
    }
}
