package dodatkowe_04;

public class Avatar {
    private final String characterName;
    private int health;
    private Stuff hand;

    public Avatar(String characterName, int health){
        this.characterName = characterName;
        this.health = health;
        this.hand = null;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public String getCharacterName(){
        return characterName;
    }

    public void takeWeapon(Weapon weapon){
        this.hand = weapon;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public int attack(){
        if(hand instanceof Weapon) {
            return ((Weapon) hand).getBaseAttack();
        }
        return 0;
    }

    public void hurt(int damage){
        health -= damage;
    }

}
