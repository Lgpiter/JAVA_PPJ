package PPJ_20;

public class Phrase {
    public Word[] tab;
    int wrt;

    public Phrase(){
        this.tab = new Word[100];
        int wrt = 0;
    }

    void addWordAtEnd(Word a){
        tab[wrt++] = a;
    }

    void show(){
        for (int i = 0; i < wrt; i++){
           tab[i].show();
            System.out.print(" ");
        }
        System.out.println();
    }
}
