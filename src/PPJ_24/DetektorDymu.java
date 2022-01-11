package PPJ_24;

public class DetektorDymu {

    public static void sprawdz() throws Alarm{
        boolean czy_dym =true;
        if(czy_dym)
            throw new Alarm("TUTAJ SIE PALI!!!");
    }
}
