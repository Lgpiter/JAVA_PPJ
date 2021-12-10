package PPJ_20;

public class Word {
    private final char[] tab;
    private int wrt;

    public Word(){
        this.tab = new char[100];
        this.wrt = 0;
    }

    public void addChar(char a){
        tab[wrt++] = a;
    }

    public void show(){
        for(int i = 0; i < wrt; i++){
            System.out.print(tab[i]);
        }
    }

    public int lenght(){
        return wrt;
    }
}
