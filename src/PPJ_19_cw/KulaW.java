package PPJ_19_cw;

public class KulaW {
    private double promienKuli;

    public KulaW(Kwadrat k){
        this.promienKuli = k.getbok()/2;
    }

    public KulaW(Walec w){
        this.promienKuli = w.getWysokosc()/2;
    }

    public void show(){
        System.out.println("A zatem promien kuli wpisanej jest rowny " + promienKuli);
    }
}
