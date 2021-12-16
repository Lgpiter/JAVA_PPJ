package PPJ_21.Zadanie2;

public class Main {
    public static void main(String[] args) {
        MyStackString poolA = new MyStackString();
        MyStackString poolB = new MyStackString();
        //Dodanie wszystkich zespolow do koszyka A
        poolA.pushString("PSG");
        poolA.pushString("Atletico Madryt");
        poolA.pushString("Sporting CP");
        poolA.pushString("Inter");
        poolA.pushString("Benfica");
        poolA.pushString("Villarreal");
        poolA.pushString("RB Salzburg");
        poolA.pushString("Chelsea");
        //Dodanie wszystkich zespolow do koszyka B
        poolB.pushString("Manchaster City");
        poolB.pushString("Liverpool");
        poolB.pushString("Ajax Amsterdam");
        poolB.pushString("Real Madryt");
        poolB.pushString("Bayern Monachium");
        poolB.pushString("Machaster United");
        poolB.pushString("Lille");
        poolB.pushString("Juventus");

        MyQueue queue = new MyQueue();
        while(!poolA.empty()){
            queue.put(poolA.popString());
            queue.put(poolB.popString());
        }
        int counter = 1;
        while(!queue.empty()){
            System.out.println("Match number " + counter);
            System.out.print(queue.get() + " vs ");
            System.out.print(queue.get());
            System.out.println();
            counter++;
        }




    }
}
