package dodatkowe_03;

public class Bicycle {
    private int number_of_gears;
    private int speed;

    public Bicycle(int number_of_gears, int speed){
        this.number_of_gears = number_of_gears;
        this.speed = speed;
    }

    public void applyBrake(int a){
        this.speed -= a;
    }
}
