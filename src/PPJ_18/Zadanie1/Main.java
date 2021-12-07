package PPJ_18.Zadanie1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.birthyear = 2001;
        person.name = "Piotr";
        person.surname = "Zadykowicz";
        System.out.println("Imie osoby: " + person.name +
                        "\nNazwyisko osoby: "  + person.surname +
                        "\nWiek urodzenia: " + person.birthyear
                );
    }
}
