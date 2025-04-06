package service;

public class AgeExeption extends Exception {
    public AgeExeption(String message) {
        super(message);
    }

    public AgeExeption(String message, Throwable e) {
        super(message, e);
    }
}
