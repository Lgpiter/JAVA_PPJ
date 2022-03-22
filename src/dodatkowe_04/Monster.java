package dodatkowe_04;

public class Monster {
    private int health;
    private int attackPower;
    private int attackChance;

    public Monster(int health, int attackPower, int attackChance){
        this.health = health;
        this.attackPower = attackPower;
        this.attackChance = attackChance;
    }

    public int attack(){
        int losowanie = (int)(Math.random()*100);
        if(losowanie > attackChance)
            return 0;
        return attackPower;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public void hurt(int damage){
        health -= damage;
    }

    public int getHealth(){return health;}
}
