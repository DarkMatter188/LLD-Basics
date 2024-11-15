package com.example.designpatterns.adaptor;

public class PhonePe {
    private static BankAPI bankAPI = new YesBankAdapter();

    public static void main(String[] args) {
        bankAPI.sendMoney("1234","9876",1000);
    }
}
