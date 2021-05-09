// extend thread method
//
//class thread1 extends Thread{
//    public void run(){
//        for (int i=0;i<=1000;i++){
//            System.out.println("Thread---------1");
//        }
//    }
//}
//
//class thread2 extends Thread{
//    public void run(){
//        for (int i=0;i<=1000;i++){
//            System.out.println("Thread---------2");
//        }
//    }
//}


// runnable method
//class thread3 implements Runnable {
//
//    @Override
//    public void run() {
//        for(int i = 0; i <= 1000; i++ ){
//            System.out.println("Thread------------3");
//        }
//    }
//}
//
//class thread4 implements Runnable {
//
//    @Override
//    public void run() {
//        for(int i = 0; i <= 1000; i++ ){
//            System.out.println("Thread------------4");
//        }
//    }
//}



class prio_thread_1 extends Thread{

    //thread in constructor
    prio_thread_1(String name){
        super(name);

    }

    public void run(){
        for(int i=0; i<=100;i++){
            System.out.println("This a thread "+this.getName());
        }

    }
}

public class thread_1 {
    public static void main(String[] args) {

        // extend  thread method
//        thread1 t1 = new thread1();
//        thread2 t2 = new thread2();
//
//        t1.start();
//        t2.start();


        // runnable method
//        thread3 t3 = new thread3();
//        Thread a1 = new Thread(t3);
//        thread4 t4 = new thread4();
//        Thread a2 =  new Thread(t4);
//
//        a1.start();
//        a2.start();

        // priority thread

        prio_thread_1 p1 = new prio_thread_1("Parth");
        prio_thread_1 p2 = new prio_thread_1("Mit");
        prio_thread_1 p3 = new prio_thread_1("Sanat");
        prio_thread_1 p4 = new prio_thread_1("Ankur");
        prio_thread_1 p5 = new prio_thread_1("Jaimin");

        p5.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);
        p3.setPriority(Thread.NORM_PRIORITY);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
