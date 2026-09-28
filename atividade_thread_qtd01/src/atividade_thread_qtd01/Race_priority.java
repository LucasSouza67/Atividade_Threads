package atividade_thread_qtd01;

public class Race_priority {
	
	public static void main(String[] args) {

         executarComRunnable();

         //executarComThread();
    }
	
	public static void executarComRunnable() {

        for (int i = 1; i <= 10; i++) {

            RacerRunnable racer = new RacerRunnable(i);

            Thread thread = new Thread(racer);
            
            if (i % 2 == 0) {
                thread.setPriority(Thread.MAX_PRIORITY);
            } else {
                thread.setPriority(Thread.MIN_PRIORITY);
            }

            thread.start();
        }
    }
	
	public static void executarComThread() {
        for (int i = 1; i <= 10; i++) {
        	
            RacerThread racer = new RacerThread(i);
            
            racer.start();
        }
    }

}
