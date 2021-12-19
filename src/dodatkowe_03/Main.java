package dodatkowe_03;

public class Main {
    public static void main(String[] args) {
       /* Monster first = new Monster();

        Monster second = new Monster("kolos",(int)(Math.random()*10000),(int)(Math.random()*1000));

        first.show();
        second.show();
        System.out.println(Monster.fight(first, second).toString());
        */

        boolean b, c = true;
        int i = 2;
        b = (i != 1) || (c = false) && (i!=0);
        System.out.println(++i + " " + b + " " + c);
    }
}
