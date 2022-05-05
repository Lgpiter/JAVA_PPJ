package GUI_5;

public  class  Main {
    public  static  void  main(String [] args) throws  InterruptedException {
        Letters  letters = new  Letters("ABCD");

       for (Thread t : letters.getThreads ())
           System.out.println(t.getName());


       for(Thread t : letters.getThreads())
           t.start();

        Thread.sleep (5000);

        /*<- tu należy zapisać
        fragment , który kończy  działanie wątków, wypisujących litery

        * */
        for(Thread t : letters.getThreads())
            t.interrupt();

        System.out.println("\nProgram  skończył działanie");
    }
}