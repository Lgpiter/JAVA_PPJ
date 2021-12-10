package PPJ_20;
import PPJ_19_cw.Osoba;

import java.util.Calendar;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name){
        this(name,1990);
    }

    public String getname(){
        return name;
    }

    public int getAge(){
        int actual_year = Calendar.getInstance().get(Calendar.YEAR);
        return (actual_year - birthYear);
    }

    static Person getOlder(Person a, Person b){
        if(a.getAge() > b.getAge()) {
            return a;
        }
        else {
            System.out.println(b.getname());
            return b;
        }
    }

    static Person getOldest(Person[] tab){
        int max = 0;
        Person oldest = null;
        for (int i = 0; i < tab.length; i++){
            if(tab[i].getAge() > max){
                oldest = tab[i];
                max = tab[i].getAge();
            }
        }
        System.out.println(oldest.getname());
        return oldest;
    }
}
