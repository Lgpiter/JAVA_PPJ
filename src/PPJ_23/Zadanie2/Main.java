package PPJ_23.Zadanie2;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4};
        for(int i = 0; i < tab.length - 1; i++){
            tab[i] = tab[i+1];
        }

        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i] + " ");
        }
    }
}
