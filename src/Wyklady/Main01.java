package Wyklady;

public class Main01 {
    public static void main(String[] args) {
        MyList list = new MyList();

        list.add(
                new Element(10)
        );
        list.add(
                new Element(20)
        );

        list.addEnd(new Element(5));

        list.insertSorted(new Element(15));
        list.show();
        System.out.println("=============");
        list.showRe();
    }
}
