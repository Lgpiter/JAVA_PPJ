package PPJ_21.Zadanie2;

public class MyQueue {
    private NodeString head;

    public MyQueue(){this.head = null;}

    //dodawanie elementu na koniec kolejki
    public void put(String a){
        NodeString club = new NodeString(a);
        if(head == null)
            head = club;
        else {
            NodeString tmp = head;
            while (tmp.getNextString() != null)
                tmp = tmp.getNextString();
            tmp.setnext(club);
        }
    }

    //pobranie elemntu z początku kolejki
    public String get(){
        String d = head.getDataString();
        head = head.getNextString();
        return d;
    }

    public void show(){
        NodeString tmp = head;
        while(tmp != null) {
            System.out.println(tmp.getDataString());
            tmp = tmp.getNextString();
        }
    }

    public boolean empty(){return head == null;
    }
}
