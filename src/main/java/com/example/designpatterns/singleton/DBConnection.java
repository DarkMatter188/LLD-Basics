package com.example.designpatterns.singleton;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection implements Callable<DBConnection> {
    private static DBConnection instance = null;

    String url;
    String username;
    String password;
    static Lock lock = new ReentrantLock();

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        //for multiple threads use double check locking

        if(instance == null) {
            lock.lock();
            if(instance == null) {
                instance = new DBConnection();
            }
            lock.unlock();
        }
        return instance;
    }

    public DBConnection call(){
        return DBConnection.getInstance();
    }

}
