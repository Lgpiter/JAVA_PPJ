package PPJ_22.Zadanie4;

public class DrzewoLisciaste
    extends Drzewo{
    private int ksztaltliscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltliscia){
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltliscia = ksztaltliscia;
    }

    public String toString(){
        return super.toString() + ", a jego lisc ma kszalt numer " + ksztaltliscia;
    }

    @Override
    public void zerwijOwoc() throws DrzewoBezOwocoweException {
        super.zerwijOwoc();
    }
}
