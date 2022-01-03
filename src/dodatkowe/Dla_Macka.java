package dodatkowe;

public class Dla_Macka {
    public static void main(String[] args) {
        int[] tab = {0,7,12,35,41,83,6,3,2};
        uporzadkuj(tab);
        wyswietl(tab);
    }

    public static int[] uporzadkuj(int[] T){
        int pom;//do zamiany
        //parzyste nierosnaco
        for (int i = 0; i < T.length; i+=2){
            for(int j = i; j < T.length; j += 2){
                if(T[j] >= T[i]){
                    pom = T[j];
                    T[j] = T[i];
                    T[i] = pom;
                }
            }
        }

        //nieparzyste nierosnaco
        for (int i = 1; i < T.length; i+=2){
            for(int j = i; j < T.length; j += 2){
                if(T[j] <= T[i]){
                    pom = T[j];
                    T[j] = T[i];
                    T[i] = pom;
                }
            }
        }

        return T;
    }

    public static void wyswietl(int[] tab){
        System.out.println("Parzyste");
        for(int i = 0; i < tab.length; i += 2){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println("Nieparzyste");
        for(int i = 1; i < tab.length; i += 2){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
