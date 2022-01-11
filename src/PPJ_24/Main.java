package PPJ_24;

public class Main {
    public static void main(String[] args) {
        Rakieta nowa = new Rakieta("Szybka", 900);

        try{
            nowa.start();
        }catch (MyException ex){
            ex.printStackTrace();
        }

        try{
            DetektorDymu.sprawdz();
        }catch (Alarm al){
            al.printStackTrace();
        }

    }
}
