package PPJ_18.Zadanie2;
import java.util.Random;

public class Fruit {
    Random r = new Random();

    String name;
    double weight = Math.random()*0.3 + 0.5;

    public Fruit(String wpisanie){
        this.name = wpisanie;
    }

    public void show(){
        System.out.println("Nazwa owocu to " + name + " a jego waga to " + weight);
    }
}
