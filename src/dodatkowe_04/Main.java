package dodatkowe_04;

public class Main {
    public static void main(String[] args) {
        Weapon topor = new Weapon("axe", 5,500,10);
        Avatar wojownik = new Avatar("Rumki",10000);
        wojownik.takeWeapon(topor);
        Monster kolos = new Monster(15000,400, 80);
        Arena arena = new Arena(wojownik, kolos);
        arena.fight();
    }
}
