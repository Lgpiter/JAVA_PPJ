package PPJ_22.Zadanie4;

public class Drzewo {
    private boolean wiecznieZielone;
    private int wysokosc;
    private String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa){
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public String toString(){
        return "Czy drzewo zawsze jest zielone " + wiecznieZielone +
                " jego wysokosc to metrow " + wysokosc +
                " a jego przkroj to " + przekrojDrzewa;
    }

    public void zerwijOwoc() throws DrzewoBezOwocoweException{
        throw new DrzewoBezOwocoweException();
    }
}
