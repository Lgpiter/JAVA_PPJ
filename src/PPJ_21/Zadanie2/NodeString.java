package PPJ_21.Zadanie2;


public class NodeString {
    private String data;
    NodeString next;

    NodeString (String data, NodeString next){
        this.data = data;
        this.next = next;
    }

    NodeString(String data){
        this(data,null);
    }

    String getDataString(){
        return data;
    }

    NodeString getNextString(){
        return next;
    }

    public void setnext(NodeString element){
        next = element;
    }

}
