package com.example.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> studentMap = new HashMap<>();

    //methods to add and get from this map all prototype objs
    public void register(String key, Student student) {
        studentMap.put(key, student);
    }

    public Student get(String key){
        return studentMap.get(key);
    }

}
