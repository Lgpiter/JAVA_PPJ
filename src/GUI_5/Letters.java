package GUI_5;

import java.util.ArrayList;

public class Letters {
    ArrayList<Thread> list = new ArrayList<Thread>();

    public Letters(String letters){
        char[] tab = letters.toCharArray();
        for(int i = 0; i < tab.length; i++){
            Thread tmp = new Thread(new Runnable() {
                @Override
                    public void run() {
                        char[] tab2 = letters.toCharArray();
                        for(int i = 0; i < tab2.length; i++){
                            System.out.print(tab2[i]);

                        }
                    }
                }
            );
            tmp.setName("Thread " + tab[i]);
            list.add(tmp);
        }
    }

    public  ArrayList<Thread>getThreads(){
        return list;
    }

}
