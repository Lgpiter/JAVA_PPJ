package dodatkowe_03;

public class Main {
    public static void main(String[] args) {
        Monster first = new Monster();
        System.out.println(first.name);
        System.out.println(first.strength);
        System.out.println(first.health);
        Monster second = new Monster("kolos",50000,350);
        System.out.println(second.name);
        System.out.println(second.strength);
        System.out.println(second.health);
    }
}
