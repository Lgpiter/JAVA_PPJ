package dodatkowe;

public class Dla_Radzia_2D {
    public static void main(String[] args) {
        int[][] tab = {
            {1,2,3,4,5,6,7},
            {4,5,6,5,7,7,8},
            {2,5,6,4,4,5,7},
            {5,7,3,5,4,4,3}
        };

        System.out.println(getSum(tab));
        wypisz(tab);
        System.out.println("=================================");
        wypisz(getColSwapped(tab));
        System.out.println(getSumDiagonal(tab));
    }

    public static int getSum(int[][] arr){
        int suma = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                suma += arr[i][j];
            }
        }
        return suma;
    }

    public static int[][] getColSwapped(int[][] arr){
        int[][] tab = arr;

        for(int i =0,pom; i < arr.length; i++){
            pom = tab[i][0];
            tab[i][0] = tab[i][tab[i].length - 1];
            tab[i][tab[i].length - 1] = pom;
        }
        return tab;
    }

    public static void wypisz(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static  int getSumDiagonal(int[][] arr){
        int suma = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length;j++){
                if(i == j)
                    suma += arr[i][j];
            }
        }
        return suma;
    }

    public static int[] getSumaAtlndices(int[] arr1, int[] arr2){
        if(arr1.length == arr2.length){
            int[] tab = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++){
                tab[i] = arr1[i] + arr2[i];
            }
            return tab;
        }
        else
            return null;
    }


}
