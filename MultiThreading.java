// public class MultiThreading extends Thread {

//     public void run(){
//         System.out.println("Thread tasks");
//     }
//     public static void main(String[] args) {
//         MultiThreading th=new MultiThreading();
//         th.start();
//     }
// }

public class MultiThreading implements Runnable{

    @Override
    public void run() {
        System.out.println("runnable interface");
        
    }
    public static void main(String[] args) {
               MultiThreading mt=new MultiThreading();
               Thread  th=new Thread(mt);
               th.start();      
    }
}
