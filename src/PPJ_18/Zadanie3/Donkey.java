package PPJ_18.Zadanie3;

public class Donkey {
    private double mass = 40;//w kilogramach
    Balloon[] tablica = new Balloon[1];

    public void addBaloon(Balloon a){
        Balloon[] temp = new Balloon[tablica.length + 1];
        if(tablica[0] == null){
            tablica[0] = a;
        }
        for (int i = 0; i < tablica.length; i++){
            temp[i] = tablica[i];
        }
        tablica = temp;
        tablica[tablica.length - 1] = a;
    }

    boolean isFlying(){
        double suma = 0;

        for (int i = 0; i < tablica.length; i++){
            if (tablica[i] != null)
                suma += tablica[i].getLoad();
        }

        if (suma > mass)
            return true;
        else
            return false;
    }
}
