package com.company.lesson9.errors;

public class Factory {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Bob");
        worker1.onVacation();

        try {
            worker1.goToWork();
        } catch (WorkerIsNotReadyException e) {
            e.printStackTrace();
        }
    }
}
