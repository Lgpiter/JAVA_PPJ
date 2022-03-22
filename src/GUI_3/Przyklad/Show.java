package GUI_3.Przyklad;

@FunctionalInterface //dobra praktyka programistyczna
public interface Show {

    default void showText(String text){
        System.out.println(text);
    }// wtedy jak tworzymy klase, ktora implementuje
    void showHelloWithText(String text);// w ramach interface wszystko jest publiczne
}
