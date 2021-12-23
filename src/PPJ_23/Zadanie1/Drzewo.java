package PPJ_23.Zadanie1;

public class Drzewo {

    private Owoc owoc;

    public Drzewo(){};

    public Owoc zerwijOwoc(){
        int i = (int)(Math.random()*(4-1)) + 1;

        if(i == 1) {
            owoc = new Jablko();
            owoc.getMasa();
            return owoc;
        }
        if (i == 2) {
            owoc = new Gruszka();
            owoc.getMasa();
            return owoc;
        }
        else  {
            owoc = new Pomarancza();
            owoc.getMasa();
            return owoc;
        }
    }
}
