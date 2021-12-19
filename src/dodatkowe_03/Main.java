package dodatkowe_03;

public class Main {
    public static void main(String[] args) {
        /*Monster first = new Monster();

        Monster second = new Monster("Kolos",(int)(Math.random()*10000),(int)(Math.random()*1000));

        first.show();
        second.show();
        Monster.fight(first, second);*/

        Zwierzak kot = new Zwierzak("Mlody", 5);
        kot.setWaga(10);
        kot.incWiek();
        kot.show();

        Bicycle bicycle = new Bicycle (1, 50);
        MountainBike mountainBike = new MountainBike(5,100,4.0);

        bicycle.applyBrake(10);
        System.out.println(bicycle);

        mountainBike.applyBrake(10);
        System.out.println(mountainBike);

    }
}
