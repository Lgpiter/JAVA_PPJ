package Wyklady;

public class Element {

    private Element next;
    private int data;

    public Element(int data){
        this.data = data;
        this.next = null;
    }

    public void setnext(Element next){
        this.next = next;
    }

    public int getData(){
        return data;
    }

    public Element getNext(){
        return next;
    }
}
