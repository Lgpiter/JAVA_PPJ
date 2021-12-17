package PPJ_22.Zadanie1;

public class Ostroslup
    extends Trojkat{
        private int h;
        public Ostroslup(int bok_trojkata, int h){
            super(bok_trojkata);
            this.h = h;
        }

        public void showOstroslup(){
            double objetosc = (((Math.pow(getBok_trojkata(),2)*Math.sqrt(3))) * h)/12;
            System.out.println("Objetosc ostroslupa jest rowna " + objetosc);
            double pole = Math.pow(getBok_trojkata(),2)*Math.sqrt(3);
        }
}
