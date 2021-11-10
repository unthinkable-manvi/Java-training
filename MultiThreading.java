// public class MultiThreading extends Thread {

//     public void run(){
//         System.out.println("Thread tasks");
//     }
//     public static void main(String[] args) {
//         MultiThreading th=new MultiThreading();
//         th.start();
//     }
// }
// Performing single task from single thread
class Test extends Thread{
        public void run(){
            System.out.println("single thread task");
        }
       
}
// Performing single task from multiple thread
class Test2 extends Thread{
    public void run(){
        System.out.println("single task from multiple thread");
    }
}


public class MultiThreading {
    public static void main(String[] args) {
        Test t=new Test();
        t.start();
        Test2 t2=new Test2();
        t2.start();
        Test2 t22=new Test2();
        t22.start();

    }
}

