package PPJ_20;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        /* PERSONA
        Person person_1 = new Person("Milosz", 2002);
        Person person_2 = new Person("Piotrek", 2001);
        Person person_3 = new Person("Grzegorz", 1975);
        Person person_4 = new Person("Barbara", 1976);

        Person[] tab = {person_1, person_2, person_3, person_4};

        Person.getOldest(tab);
        System.out.println(Person.getOlder(person_1,person_2).getname());

        for (int i = 0; i < tab.length - 1; i++){
            for (int j = i + 1; j < tab.length; j++){
                if(tab[j].getAge() > tab[i].getAge()){
                    Person pom = tab[j];
                    tab[j] = tab[i];
                    tab[i] = pom;
                }
            }
        }

         */
        //Word
        Word kartka_1 = new Word();
        kartka_1.addChar('K');
        kartka_1.addChar('o');
        kartka_1.addChar('t');
        kartka_1.show();
        System.out.println("\n" + kartka_1.lenght());

        Word kartka_2 = new Word();
        kartka_2.addChar('M');
        kartka_2.addChar('a');

        Phrase phrase = new Phrase();
        phrase.addWordAtEnd(kartka_1);
        phrase.addWordAtEnd(kartka_2);
        phrase.show();

        Phrase_list list = new Phrase_list();
        list.addEnd(kartka_1);
        list.addEnd(kartka_2);
        list.show();

    }
}
