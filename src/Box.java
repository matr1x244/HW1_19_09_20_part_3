import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends  Fruit> {

    private ArrayList<T> box = new ArrayList<>();

    public Box(){
    }
    
    
    public ArrayList<T> getBox() {
        return box;
    }

    public void setBox(ArrayList<T> box) {
        this.box = box;
    }

 
    public float getWeight() {
        float weight = 0.0f;
        for (T o: box)
        weight += o.getWeight();

        return weight;
    }
    
    
    public boolean compare(Box <?> anotherBox) {
        //return Math.abs (this.box - anotherBox.box ()) < 0.00001; с урока
        if(getWeight() == anotherBox.getWeight()) return true;
        return false;
    }
    
    public void transfer(Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

    
    public void addFruit(T fruit, int количество){
        for(int i = 0; i < количество; i++){
            box.add(fruit);
        }
    }
    
}
