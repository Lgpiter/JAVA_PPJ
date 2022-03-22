package PPJ_z14;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Zadanie1();
        String imie = "jOHN";
        System.out.println(norm(imie));
        System.out.println(init("john richard doe"));
    }

    public static void Zadanie1(){
        int n = 1437226410;
        System.out.println("1. " + (n & 0b11111));
        System.out.println("2. " + ((n >> 7)& 1)); // 10001001 >> 100
        System.out.print("3. ");
        for(int i = 0; i < 4; i++){
            System.out.println((n >>i*8) & 0b11111111);
        }
        System.out.println("4. " + ((n>>8) & 0b1111_1111_1111_1111));
    }

    public static String norm(String name){
       return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static String init(String name){
        String[] tab = name.split(" ");
        if(tab.length == 3)
            return tab[0].substring(0,1).toUpperCase() + ". " + tab[1].substring(0,1).toUpperCase()+ ". " + norm(tab[2]);
        else
            return tab[0].substring(0,1).toUpperCase() + ". " + norm(tab[1]);
    }

}
