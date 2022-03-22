package dodatkowe_04;

public class Stuff {
    private String name;
    private int weight;

    public Stuff(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return "Weapon is " + name + " and it weights " + weight;
    }
}
