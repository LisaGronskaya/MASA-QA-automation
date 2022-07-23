package com.company.lesson9.errors;


public class WorkerIsNotReadyException extends Exception {

    public WorkerIsNotReadyException(String message) {
        super(message);
    }

    public WorkerIsNotReadyException() {

    }
}
