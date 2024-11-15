package com.example.designpatterns.adaptor;

public interface BankAPI {
    //will contain methods needed by PhonePe to implement all methods
    void sendMoney(String from, String to, int amount);

    void registerAccount(String accountNumber);

    long getBalance(String accountNumber);

}
