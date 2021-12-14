package PPJ_21;

public class Node {
    private Student data;
    Node next;

    Node (Student data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(Student data){
        this(data,null);
    }

    Student getData(){
        return data;
    }
    Node getNext(){
        return next;
    }
}
