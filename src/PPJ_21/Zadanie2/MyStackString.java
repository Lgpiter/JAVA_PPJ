package PPJ_21.Zadanie2;

public class MyStackString {
    private NodeString head;

    public MyStackString(){
        head = null;
    }

    public void pushString(String data){
        head = new NodeString(data,head);
    }

    public String popString(){
        String d = head.getDataString();
        head = head.getNextString();
        return d;
    }

    public boolean empty(){
        return head == null;
    }
}
