package GUI_4.Zadanie1;

import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Osoba kowalski = new Osoba("Jan", "Kowalski");
        Osoba nowak = new Osoba("Adam", "Nowak");
        Osoba krawczyk = new Osoba("Bartosz", "Krawczyk");
        Osoba heniek = new Osoba("Kierownik", "Heniek");
        Samochod skoda1 = new Samochod("WA00001", Samochod.Marka.SKODA);
        Samochod skoda2 = new Samochod("SC36010", Samochod.Marka.SKODA);
        Samochod mazda1 = new Samochod("WA01234", Samochod.Marka.MAZDA);
        Samochod mazda2 = new Samochod("DW01ASD", Samochod.Marka.MAZDA);
        Samochod bmw = new Samochod("WA12690", Samochod.Marka.BMW);
        Samochod volvo = new Samochod("KR60606", Samochod.Marka.VOLVO);


        HashMap<Osoba,ArrayList<Samochod>> wlascicieleSamochodow = new HashMap<Osoba,ArrayList<Samochod>>();

        wlascicieleSamochodow.put(kowalski,new ArrayList<Samochod>());
        wlascicieleSamochodow.get(kowalski).add(skoda1);
        wlascicieleSamochodow.get(kowalski).add(bmw);

        wlascicieleSamochodow.put(nowak,new ArrayList<Samochod>());
        wlascicieleSamochodow.get(nowak).add(mazda2);

        wlascicieleSamochodow.put(krawczyk, new ArrayList<Samochod>());
        wlascicieleSamochodow.get(krawczyk).add(volvo);
        wlascicieleSamochodow.get(krawczyk).add(mazda1);
        wlascicieleSamochodow.get(krawczyk).add(skoda2);

        wlascicieleSamochodow.put(heniek, new ArrayList<Samochod>());

        System.out.println("Osoby i ich samochody:");

        for(Osoba osoba : wlascicieleSamochodow.keySet()){
            System.out.println(osoba + " posiada " + wlascicieleSamochodow.get(osoba));
        }

        System.out.println("Pojazdy zaczynajace sie od WA");

        for(ArrayList<Samochod> samochod : wlascicieleSamochodow.values()){
            for(Samochod pojazd : samochod){
                if(pojazd.getNr_rejestracyjny().charAt(0) == 'W' && pojazd.getNr_rejestracyjny().charAt(1) == 'A')
                System.out.println(pojazd.getNr_rejestracyjny());
            }
        }







        //System.out.println(wlascicieleSamochodow.get(nowak).get(0));
        /*
        * Jan  Kowalski  -> SKODA  WA00001 , BMW  WA12690*
         *  Adam  Nowak  -> MAZDA  DW01ASD
         * * Bartosz  Krawczyk  -> VOLVO  KR60606 , MAZDA  WA01234 , SKODA  SC36010
         * * Kierownik  Heniek  -> [Brak  samochodów]** Samochody , których  numery  rejestracyjne  zaczynają się na WA:
         * * SKODA  WA00001
         * * BMW  WA12690
         * * MAZDA  WA01234* */

    }
}
