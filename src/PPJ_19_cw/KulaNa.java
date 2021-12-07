package PPJ_19_cw;

public class KulaNa {
    private double promienKuliNa;

    public KulaNa(Kwadrat k){
        double przekatna_szescianu = k.getbok() * Math.sqrt(3);
        this.promienKuliNa = przekatna_szescianu/2;

    }

    public KulaNa(Walec w){
        double wysokosc_walca = w.getWysokosc();
        double promien_walca = w.getPromien();
        this.promienKuliNa = Math.sqrt(2*promien_walca*2*promien_walca + wysokosc_walca*wysokosc_walca)/2;
    }

    public void show(){
        System.out.println("A zatem promien kuli opisanej jest rowny " + promienKuliNa);
    }
}
