package Wyklady;

public class MyList {

    private Element head;

    public void add (Element element){
        if (head != null)
            element.setnext(head);
        head = element;
    }

    public void addEnd(Element element){
        if(head == null)
            head = element;
        else{
            Element tmp = head;
            while(tmp.getNext() != null)
                tmp = tmp.getNext();
            tmp.setnext(element);
        }
    }

    public void insertSorted(Element element){
        Element tmp = head;
        while (tmp.getNext() != null && tmp.getNext().getData() > element.getData())
            tmp = tmp.getNext();
        if((tmp.getNext()) == null)
            tmp.setnext(element);
        else {
            element.setnext(tmp.getNext());
            tmp.setnext(element);
        }
        //System.out.println("Found: " + tmp.getData());
    }

    public void show(){
        Element tmp = head;
        while(tmp != null) {
            System.out.println(tmp.getData());
            tmp = tmp.getNext();
        }
    }

    public void showRe(){
        showRe(head);
    }

    private void showRe(Element element){
        if(element != null) {
            showRe(element.getNext());
            System.out.println(element.getData());
        }

    }
}
