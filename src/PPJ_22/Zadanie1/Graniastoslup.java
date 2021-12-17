package PPJ_22.Zadanie1;

public class Graniastoslup
    extends Trojkat{
        private int h;
        public Graniastoslup(int bok_trojkata, int h){
            super(bok_trojkata);
            this.h = h;
        }

        public void showGraniastoslupa(){
            double pole = Math.pow(getBok_trojkata(),2)*Math.sqrt(3)/2 + 3 *Math.pow(getBok_trojkata(),2)*Math.sqrt(3)/4*h;
            System.out.println("Pole Graniastoslupa jest rowne " + pole);
            double objetosc = Math.pow(getBok_trojkata(),2)*Math.sqrt(3)/4 * h;
            System.out.println("Objetosc graniastoslupa jest rowna " + objetosc);
        }
}
