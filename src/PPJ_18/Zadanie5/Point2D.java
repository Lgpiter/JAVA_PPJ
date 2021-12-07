package PPJ_18.Zadanie5;

public class Point2D {
    int x;
    int y;

    public  void set (int tab[]){
        x = tab[0];
        y = tab[1];
    }
    public int[] get(){
        int[] arr = {x,y,1};
        System.out.print(x + " " + y);
        return arr;
    }
}
