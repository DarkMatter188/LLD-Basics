package com.example.tictactoe.exceptions;

public class InvalidPlayerCountException extends Exception {
    public InvalidPlayerCountException(String message) {
        super(message);
    }
}
