package PPJ_24;

public class Rakieta {
    private String nazwa;
    private int wagaPaliwa;

    public Rakieta(String nazwa, int wagaPaliwa){
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj(){
        wagaPaliwa += (int)(Math.random()*10000);
    }

    public void start() throws MyException{
        if(wagaPaliwa < 1000){
            throw new MyException("start anulowany - za malo paliwa");
        }
        System.out.println("START");
    }
}
