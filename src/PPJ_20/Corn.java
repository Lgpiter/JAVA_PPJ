package PPJ_20;


public class Corn {
    public int cornCount;

    public Corn (int cornCount){this.cornCount = cornCount;}

    public Popcorn[] makePopcorn(){
        Popcorn[] tab = new Popcorn[cornCount];
        for (int i = 0; i < tab.length; i++){
            Popcorn tmp = new Popcorn();
            tab[i] = tmp;
        }
        return tab;
    }
}
