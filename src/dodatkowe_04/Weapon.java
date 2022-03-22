package dodatkowe_04;

public class Weapon
    extends Stuff{
    private int baseAttack;
    private int bonus;
    public Weapon(String name, int weight, int baseAttack, int bonus){
        super(name, weight);
        this.baseAttack = baseAttack;
        this.bonus = bonus;
    }

    public int getBaseAttack() {
        return baseAttack;
    }
}
