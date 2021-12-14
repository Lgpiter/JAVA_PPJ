package PPJ_21;

public class Main {

    public static void main(String[] args) {
        Student michal = new Student(21444, "Michał");
        Student seba = new Student(343143, "Seba");
        Student milosz = new Student(8548854, "Milosz");
        Student kuba = new Student(5932923, "Kuba");
        MyStack stack = new MyStack();
        stack.push(michal);
        stack.push(seba);
        stack.push(milosz);
        stack.push(kuba);
        while(!stack.empty()) {
            System.out.println("Popping");
            stack.pop().show();
        }

        System.out.println("Table ");
        MyStackTablice stackTablice = new MyStackTablice(10);
        stackTablice.pushTab(michal);
        stackTablice.pushTab(seba);
        stackTablice.showTab();
        System.out.println("Popping ");
        stackTablice.popTab().show();
        System.out.println("And now our tab looks like");
        stackTablice.showTab();
    }
}
