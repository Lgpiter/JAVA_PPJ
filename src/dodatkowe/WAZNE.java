package dodatkowe;

public class WAZNE {
    public static void main(String[] args) {
        char[] dataCore = { 't','o','p','s','e','c','r','e','t','d','a','t','a'};
        System.out.println(117 & 118);
       // dataCoreEncrypt(dataCore);
        System.out.println(1010 & 1);
    }

    public static char[] dataCoreEncrypt(char[] tab){
        char[] wynikowa = new char[tab.length];

        for(int i  = 0; i < tab.length; i++){

            System.out.println("wartosc znaku to " + (int)tab[i]);
            System.out.println("wartosc o jeden wieksza to " + (int)(tab[i] + 1));
            System.out.println("Ich koniunkcja bitowa to " + (tab[i] & (tab[i] + 1)));
        }

        return wynikowa;
    }
}
