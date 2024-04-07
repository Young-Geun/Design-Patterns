package org.example.designpatterns._03_behavioral._19_observer._03_java;

public class MyEvent {

    private String message;

    public MyEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
