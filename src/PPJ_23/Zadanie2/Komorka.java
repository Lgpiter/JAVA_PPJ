package PPJ_23.Zadanie2;

public class Komorka
    extends Telefon{

    public Komorka(String interfejsKomunikacyjny, String color){
        super(interfejsKomunikacyjny, color);
    }

    public String[] tab_numerow = new String[10];
    int counter = 0;

    public void zadzwon(String numer) {
        super.zadzwon(numer);
        if(counter != tab_numerow.length) {
            tab_numerow[counter++] = numer;
        }
        else{
            for(int i = 0; i < tab_numerow.length - 1; i++){
                tab_numerow[i] = tab_numerow[i + 1];
            }
            tab_numerow[tab_numerow.length - 1] = numer;
        }
    }

    public void wyswietlHistoriePolaczen(){
        for(int i = 0; i < tab_numerow.length; i++){
            if(tab_numerow[i] != null)
                System.out.println(tab_numerow[i]);
        }
    }
}
