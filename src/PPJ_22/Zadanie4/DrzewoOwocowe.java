package PPJ_22.Zadanie4;

public class DrzewoOwocowe
    extends DrzewoLisciaste{
    private String nazwaOwoca;
    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltliscia,String nazwaOwoca){
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltliscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    public String toString(){
        return super.toString() + " a nazwa jego owocu to " + nazwaOwoca;
    }

    @Override
    public void zerwijOwoc(){
        System.out.println("Zostal zerwany owoc: " + nazwaOwoca);
    }
}
