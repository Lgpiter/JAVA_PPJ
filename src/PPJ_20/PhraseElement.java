package PPJ_20;


public class PhraseElement {

        private final Word data;
        private PhraseElement next;

        public PhraseElement(Word data){
            this.data = data;
            next = null;
        }

        public void setnext(PhraseElement element){
            next = element;
        }

        public Word getData(){
            return data;
        }

        public PhraseElement getNext(){
            return next;
        }

}
