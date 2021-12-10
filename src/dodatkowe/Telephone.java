package dodatkowe;

public class Telephone {
    //zadanie 1
    private String model;
    private int width;
    private int height;
    private String number;

    //Zadanie 2
    public Telephone(String model, int width, int height, String number){
        this.model = model;
        this.width = width;
        this.height = height;
        this.number = number;
    }

    //Zadanie 3
    public void changeNumber(String number){
        this.number = number;
        System.out.println("New phone number is  " + this.number);
    }

    //Zadanie 4
    public void sendSMS(String number, String text){
        System.out.println("Sending message " + text + " to number " + number);
    }
}
