package dodatkowe;

public class Dla_Radzia {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = {10,20,30};
        System.out.print("[");
        wypisywanietablicy(getEven(arr,1,4));
        System.out.println("]");
        String[] arr3 = {"aabb", "abc", "bddae", "k"};
        System.out.println(getLongest(arr3));
        System.out.println(getGCD(10,30));
        wypisywanietablicy(mergeReversed(arr,arr2));

    }

    public static void wypisywanietablicy(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }
    //Zadanie 3
    public static int[] getEven(int[] arr, int from, int to){
        int licznik_parzystych = 0;

        for (int i = from; i <= to; i++){
            if(arr[i] % 2 == 0)
                licznik_parzystych++;
        }
        int[] tab_parzystych = new int [licznik_parzystych];

        for (int i = from, pom = 0; i <= to; i++){
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

    //Zadanie 1
    public static String getLongest(String[] arr){
        int indeks = 0;
        int najwieksza_dlugosc = arr[0].length();
        for (int i = 0; i < arr.length; i++){
            if(arr[i].length() > najwieksza_dlugosc) {
                indeks = i;
                najwieksza_dlugosc = arr[i].length();
            }
        }
        return arr[indeks];
    }

    //Zadanie2
    public static int getGCD(int n1, int n2){
        while (n1 != n2){
            if (n1 > n2)
                n1 = n1 - n2;
            if (n2 > n1)
                n2 = n2 - n1;
        }
        return n1;
    }

    //Zadanie 4
    public static int[] mergeReversed(int[] arr1, int[] arr2){
        int rozmiar = arr1.length + arr2.length;
        int[] wynikowa = new int[rozmiar];
        for(int i = 0, pom = 0; i < rozmiar; i++){
            if(i < arr1.length){
                wynikowa[i] = arr1[arr1.length - i - 1];
            }
            else{
                wynikowa[i] = arr2[pom];
                pom++;
            }
        }

        return wynikowa;
    }

}


