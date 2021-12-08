package Wyklady;

public class Main {
    public static void main(String[] args) {
        //pierwszy elementy listy
        Element head = null;
        {
            //dodaj wrt 10
            Element tmp = new Element(10);

            //umiescic w head
            if (head == null)
                head = tmp;
            else {
                tmp.setnext(head);
                head = tmp;
            }
        }

        {
            //dodaj wrt 20
            Element tmp = new Element(20);

            //umiescic w head
            if (head == null)
                head = tmp;
            else {
                tmp.setnext(head);
                head = tmp;
            }
        }

        //wypisywanie listy
        {
            Element tmp = head;
            while(tmp != null){
                System.out.println(tmp.getData());
                tmp = tmp.getNext();
            }
        }

    }
}
