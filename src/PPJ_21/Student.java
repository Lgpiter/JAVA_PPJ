package PPJ_21;

public class Student {
    private int sNumber;
    private String name;

    public Student(int sNumber, String name){
        this.sNumber = sNumber;
        this.name = name;
    }

    public void show(){
        System.out.println("Student number is " + sNumber + " and his/her name is " + name);
    }
}
