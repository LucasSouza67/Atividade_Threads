package atividade_thread_qtd01;

public class Race_Join {

    public static void main(String[] args) {

        executarComJoin();

    }

    public static void executarComJoin() {

        RacerThread r1 = new RacerThread(1);
        RacerThread r3 = new RacerThread(3);
        RacerThread r5 = new RacerThread(5);
        RacerThread r7 = new RacerThread(7);
        RacerThread r9 = new RacerThread(9);

        RacerThread r2 = new RacerThread(2);
        RacerThread r4 = new RacerThread(4);
        RacerThread r6 = new RacerThread(6);
        RacerThread r8 = new RacerThread(8);
        RacerThread r10 = new RacerThread(10);

        r1.start();
        r3.start();
        r5.start();
        r7.start();
        r9.start();

        try {

            r1.join();
            r3.join();
            r5.join();
            r7.join();
            r9.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        r2.start();
        r4.start();
        r6.start();
        r8.start();
        r10.start();
    }
}