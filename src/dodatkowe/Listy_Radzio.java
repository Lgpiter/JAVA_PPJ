package dodatkowe;

import java.util.ArrayList;

public class Listy_Radzio {
    public static void main(String[] args) {
        {
            //Zadanie 1
            System.out.println("Zadanie 1");
            ArrayList<String> words = new ArrayList<>();
            words.add("ala");
            words.add("dog");
            words.add("cat");
            words.add("cat");
            words.add("monkey");
            words.add("mouse");
            System.out.println(getSentenceMostOccurredWord(words));
        }

        {
            //Zadanie 2
            System.out.println("Zadanie 2");
            ArrayList<ArrayList<String>> paragraph = new ArrayList<ArrayList<String>>();
            ArrayList<String>sentence1 = new ArrayList<String>();
            ArrayList<String>sentence2 = new ArrayList<String>();
            ArrayList<String>sentence3 = new ArrayList<String>();
            sentence1.add("ala");
            sentence1.add("ma");
            sentence1.add("kota");
            sentence2.add("ala");
            sentence2.add("ma");
            sentence2.add("psa");
            sentence3.add("ala");
            sentence3.add("lubi");
            sentence3.add("ryby");

            paragraph.add(sentence1);
            paragraph.add(sentence2);
            paragraph.add(sentence3);

            System.out.println(getParagraphMostOccuredWord(paragraph));
        }
        {
            //Zadanie 3
            System.out.println("Zadanie 3");
            ArrayList<Integer> sequence = new ArrayList<Integer>();
            sequence.add(1);
            sequence.add(2);
            sequence.add(3);
            sequence.add(2);
            sequence.add(3);
            sequence.add(4);

            System.out.println(getSecondUnique(sequence));
        }

        {
            //Zadanie 4
            System.out.println("Zadanie 4");
            ArrayList<ArrayList<Integer>> sequance = new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer>sequence1 = new ArrayList<Integer>();
            ArrayList<Integer>sequence2 = new ArrayList<Integer>();
            ArrayList<Integer>sequence3 = new ArrayList<Integer>();
            sequence1.add(10);
            sequence1.add(20);
            sequence2.add(30);
            sequence2.add(40);
            sequence3.add(5);
            sequence3.add(25);

            sequance.add(sequence1);
            sequance.add(sequence2);
            sequance.add(sequence3);
            System.out.println(getSecondMinimal(sequance));
        }
    }

    //Zadanie 1
    public static String getSentenceMostOccurredWord(ArrayList<String> sentence){
        int counter = 0;
        int max = 0;
        int the_most = 0;
        for(int i = 0; i < sentence.size(); i++){
            for(int j = i + 1; j < sentence.size(); j++){
                if(sentence.get(i).equals(sentence.get(j)))
                    counter++;
            }
            if(counter >= max){
                max = counter;
                the_most = i;
            }
            counter = 0;
        }
        return sentence.get(the_most);
    }

    //Zadanie 2
    public static String getParagraphMostOccuredWord(ArrayList<ArrayList<String>> paragraph){
        int counter = 0;
        int max = 0;
        int ind_i = 0;
        int ind_j = 0;
        for (int i = 0; i < paragraph.size(); i++){
            for (int j = 0; j < paragraph.get(i).size(); j++){
                counter = 0;
                for(int k = j + 1; k < paragraph.get(i).size(); k++){
                    if(paragraph.get(i).get(j).equals(paragraph.get(j).get(k))){
                        counter++;
                    }
                }
                if(counter > max){
                    ind_i = i;
                    ind_j = j;
                }
            }
        }

        return paragraph.get(ind_i).get(ind_j);
    }

    //Zadanie 3
    public static Integer getSecondUnique(ArrayList<Integer> sequence){
        boolean the_same;
        int counter = 0;

        for(int i = 0; i < sequence.size(); i++){
            the_same = false;
            for (int j = i + 1; j < sequence.size(); j++){
                if(sequence.get(i).equals(sequence.get(j))){
                    the_same = true;
                    sequence.remove(j);
                }
            }
            if(!the_same) {
                counter++;
            }
            if(counter == 2)
                return sequence.get(i);
        }

        return null;
    }

    //Zadanie4
    public static Integer getSecondMinimal(ArrayList<ArrayList<Integer>> sequance){
        int min = sequance.get(0).get(0);
        int min_i = 0;
        int min_j = 0;

        for(int i = 0; i < sequance.size(); i++){
            for(int j = 0; j < sequance.get(i).size(); j++){
                    if(sequance.get(i).get(j) < min){
                        min = sequance.get(i).get(j);
                        min_i = i;
                        min_j= j;
                    }
            }
        }

        sequance.get(min_i).remove(min_j);

        min = sequance.get(0).get(0);
        for(int i = 0; i < sequance.size(); i++){
            for(int j = 0; j < sequance.get(i).size(); j++){
                if(sequance.get(i).get(j) < min){
                    min = sequance.get(i).get(j);
                }
            }
        }
        return min;
    }
}
