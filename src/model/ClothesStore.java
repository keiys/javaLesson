package model;

public class ClothesStore extends Store{


    @Override
    public void sell() {
        System.out.println("sell clothes");
    }

    @Override
    public void insertItem() {
        System.out.println("insert clothes");
    }
}
