import model.ClothesStore;
import model.StationeryStore;
import model.Store;

public class Homework8 {
    public static void main(String[] args) {
        Store store = new ClothesStore();
        store.sell();
        store = new StationeryStore();
        store.sell();
        store.startWorking();
        store.stopWorking();
        store.insertItem();
    }
}
