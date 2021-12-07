package PPJ_18.Zadanie3;

public class Balloon {
    double ilosc_helu;

    public Balloon(){
        this.ilosc_helu = Math.random()*0.004 + 0.005;
    }

    public double getLoad(){
        return ((6 * ilosc_helu)/ 0.007)/1000;//od razu w kilogramach
    }

}
