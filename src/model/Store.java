package model;

abstract public class Store {

    abstract public void sell();
    abstract public void insertItem();

    public void startWorking () {
        System.out.println("Working started");
    }

    public void stopWorking () {
        System.out.println("Working stopped");
    }

}
