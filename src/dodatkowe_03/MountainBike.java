package dodatkowe_03;

public class MountainBike
    extends Bicycle{
    double seat_height;

    public MountainBike(int number_of_gears, int speed, double seat_height){
        super(number_of_gears, speed);
        this.seat_height = seat_height;
    }
}
