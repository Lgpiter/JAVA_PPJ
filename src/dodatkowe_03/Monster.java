package dodatkowe_03;

public class Monster {
    /*Zadanie 1
    public String name = "Maciek";
    public int health = 14;
    public int strength = 150;

     */
    private String name;
    private int health;
    private int strength;

    public Monster(String name, int health, int strength){
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public Monster(){
        this.name = "Mutant";
        this.strength = (int)(Math.random()*1000);
        this.health = (int)(Math.random()*10000);
    }

    public int getHealth() {
        return health;
    }

    public String getName(){return name;}

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

    public static Monster fight(Monster a, Monster b){
        while(a.isAlive() && b.isAlive()){
            a.takeDamage(b.getPower());
            b.takeDamage(a.getPower());
            System.out.println("Monster " + a.getName() + " hits " + b.getName() + " for " + a.getPower() + " and now  " + b.getName() + " health equals " + b.getHealth());
        }
        if(!a.isAlive())
            return b;
        else
            return a;
    }
}
