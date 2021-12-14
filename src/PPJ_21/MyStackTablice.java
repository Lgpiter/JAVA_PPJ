package PPJ_21;

public class MyStackTablice {
    private Student[] tab;
    int top = 0;

    MyStackTablice(int wrt){
        this.tab = new Student[wrt];
    }

    public void pushTab(Student a){
        tab[top++] = a;
    }

    public void showTab(){
        for(int i = 0; i < top; i++){
                tab[i].show();
        }
    }

    public Student popTab(){
        Student pom = tab[--top];
        tab[top] = null;
        return pom;
    }

}
