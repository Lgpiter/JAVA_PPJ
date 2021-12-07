package dodatkowe;

public class Z08 {
    public static void main(String[] args) {
        /*int[] a = {2,3,2,4,3,1,6,3,2,3};
        System.out.println("2 -> " + count(a,0,2));
        System.out.println("3 -> " + count(a,0,3));
         */
       /* System.out.println("Fibonacci");
        System.out.println(fibo(15));
        System.out.println(FiboI(15));
        System.out.println("Silnia ");
        System.out.println(factR(10));
        System.out.println(factI(10));
        System.out.println("NWD dwoch liczb");
        System.out.println(gcdR(12125,40643));
        System.out.println(gcdI(12125,40643));
        */
        int[] a = {3,136,2,9,7,135};
        System.out.println("Max     : " + maxElem(a,0));
       /* System.out.println("Num even: " + numEven(a,0));
        System.out.print("Before : [ ");
        wypisz(a, 0);
        System.out.print("] ");
        reverse(a, 0);
        System.out.print("\nAfter : [ ");
        wypisz(a, 0);
        System.out.print("] ");

        */
    }

    //Zadanie 2
    static int count(int[] arr, int from, int what){
        if(from == arr.length)
            return 0;
        if (what == arr[from])
            return count(arr, from + 1, what) + 1;
        return count(arr, from + 1, what);
    }

    //Zadanie 3
    //Fibonacci rekurencyjnie
    public static int fibo(int n){
        if(n == 1 || n== 0 )
            return n;
        else
            return fibo(n-1) + fibo(n-2);
    }

    //Fibonacci iteracyjnie
    public static int FiboI(int n){
        int liczba = 0;
        if (n == 1 || n == 2)
            return 1;
        for (int i = 2, pom1 = 1, pom2 = 1; i < n; i++){
            liczba = pom1 + pom2;
            pom1 = pom2;
            pom2 = liczba;
        }
        return liczba;
    }

    //silnia rekurencyjnie
    public static int factR(int n){
        if (n == 1)
            return 1;
        else
            return n*factR(n-1);
    }

    //silnia iteracyjnie
    public static int factI(int n){
        int wynik = 1;
        while (n > 1){
            wynik*= n;
            n--;
        }
        return wynik;
    }

    //NWD rekurencyjnie
    public static int gcdR(int a, int b){
        if(a == b)
            return a;
        if (a > b)
            return gcdR(a - b, b);
        else
            return gcdR(a, b - a);
    }

    //NWD iteracyjnie
    public static int gcdI(int a, int b){
        while (a != b){
            if (a > b)
                a = a-b;
            if (b > a)
                b = b - a;
        }
        return a;
    }

    //Najwiekszy element rekurencyjnie
    public static int maxElem(int[] arr, int from){
        if (from == arr.length - 1)
            return arr[from];
        System.out.println(from);
        int pom = maxElem(arr,from + 1);

        return pom > arr[from] ? pom : arr[from];
    }

    //Ilosc elementow parzystych w tablicy rekurencyjnie
    static int numEven(int[] arr, int from){
        if(from == arr.length)
            return 0;
        if (arr[from] % 2 == 0)
            return numEven(arr, from + 1) + 1;
        return numEven(arr, from + 1);
    }

    //wypisanie tablicy rekurencyjnie
    public static void wypisz(int[] tab, int from){
        if(from == tab.length)
            return;
        System.out.print(tab[from] + " ");
        wypisz(tab, from + 1);
    }

    //odwracanie tablicy rekurencyjnie
    public static void reverse(int[] arr, int from){
        if (from == arr.length/2)
            return;
        int pom = arr[from];
        arr[from] = arr[arr.length - 1 - from];
        arr[arr.length - 1 - from] = pom;
        reverse(arr, from + 1);
    }

}
