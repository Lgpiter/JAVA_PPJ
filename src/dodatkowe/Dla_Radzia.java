package dodatkowe;

public class Dla_Radzia {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10,20,25,30,305};
        System.out.println(FiboI(10));
    }
    //Zadanie 3
    public static int[] getEven(int[] arr){
        int licznik_parzystych = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
                licznik_parzystych++;
        }
        int[] tab_parzystych = new int [licznik_parzystych];

        for (int i = 0, pom = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) {
                tab_parzystych[pom] = arr[i];
                pom++;
            }
        }

        return  tab_parzystych;
    }

    //Zadanie 4
    public static boolean arrayEquals(int[] arr, int[] arr2){
        if(arr.length != arr2.length)
            return false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != arr2[i])
                return false;
        }
        return true;
    }

    //Zadanie5
    public static int FiboI(int n){
        int liczba = 0;
        if (n == 0 || n == 1)
            return n;
        for (int i = 1, pom1 = 0, pom2 = 1; i < n; i++){
            liczba = pom1 + pom2;
            pom1 = pom2;
            pom2 = liczba;
        }
        return liczba;
    }
}


