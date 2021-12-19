package dodatkowe_03;

public class Main {
    public static void main(String[] args) {
        Monster first = new Monster();

        Monster second = new Monster("Kolos",(int)(Math.random()*10000),(int)(Math.random()*1000));

        first.show();
        second.show();
        Monster.fight(first, second);

    }
}
