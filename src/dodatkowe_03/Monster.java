package dodatkowe_03;

public class Monster {
    /*Zadanie 1
    public String name = "Maciek";
    public int health = 14;
    public int strength = 150;

     */
    public String name;
    public int health;
    public int strength;

    public Monster(String name, int health, int strength){
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public Monster(){
        this.name = "Mutant";
        this.strength = 1240;
        this.health = 10000;
    }
}
