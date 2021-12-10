package PPJ_20;

import Wyklady.Element;

public class Phrase_list {
    public PhraseElement head;

    public void add (Word a){
        PhraseElement word = new PhraseElement(a);
        if (head != null)
            word.setnext(head);
        head = word;
    }
    public void addEnd(Word a){
        PhraseElement word = new PhraseElement(a);
        if(head == null)
            head = word;
        else{
            PhraseElement tmp = head;
            while(tmp.getNext() != null)
                tmp = tmp.getNext();
            tmp.setnext(word);
        }
    }

    public void show(){
        PhraseElement tmp = head;
        while(tmp != null) {
            tmp.getData().show();
            System.out.print(" ");
            tmp = tmp.getNext();
        }
    }
}
