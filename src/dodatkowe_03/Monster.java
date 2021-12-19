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

    public int getHealth() {
        return health;
    }

    public void takeDamage(int a){health -= a;}

    public int getPower(){return strength;}

    public boolean isAlive(){
        if(health > 0)
            return true;
        else
            return false;
    }

    public void show(){
        System.out.println("Monster name is " + name + " his strength equals " + strength +
                " and his actual health level is " + health);
    }
}
