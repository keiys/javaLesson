package model;

public class StationeryStore extends Store{


    @Override
    public void sell() {
        System.out.println("sell stationery items");
    }

    @Override
    public void insertItem() {
        System.out.println("insert stationery item");
    }
}
