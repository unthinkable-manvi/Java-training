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
// class Test extends Thread{
//         public void run(){
//             System.out.println("single thread task");
//         }
       
// }
// Performing single task from multiple thread
// class Test2 extends Thread{
//     public void run(){
//         System.out.println("single task from multiple thread");
//     }
// }
// Constructor in Thread
// Thread()
// Thread(Runnable target)
// Thread(String name)
//Thread(Runnable target,String Name)
//Thread(ThreadGroup tg,Runnable target)
//Thread(ThreadGroup tg,String name)
//Thread(ThreadGroup tg,Runnable target,String name)

//Method
//Suspend(),resume(),stop(),destroy() these methods are depricated from JAVA


//Take a better example to understand the concept

// class Mytask extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("printing "+i);
//         }
//     }
// }

class Printer {
    void print(int numofcopy,String Doc){
        for(int i=0;i<=numofcopy;i++){
            System.out.println("Printing"+i+Doc);
        }
    }
}
class MyThread extends Thread{
     Printer pref;
     MyThread(Printer p){
         pref=p;
     }
     @Override
     public void run() {
        synchronized(pref){
            pref.print(10, "hello.dpf");
        }
     }

}
class MyThread2 extends Thread{
    synchronized public void run(){
        for(int i=0;i<10;i++){
        System.out.println("job5   "+i);
    }
}
}



public class MultiThreading {
     // Main thred represented as main method.      
    public static void main(String[] args) {
        // Test t=new Test();


        // t.start();
        // Test2 t2=new Test2();
        // t2.start();
        // Test2 t22=new Test2();
        // t22.start();


        //Job1
       System.out.println("----Application started");


        //Job 2
        //Mytask task=new Mytask();
         //task.run();
         //task.start();

         Printer pr=new Printer();
         MyThread mref=new MyThread(pr);
         mref.start();

         //Job 3
         MyThread2 mt=new MyThread2();
         mt.start();


         //Till job 2 is not finished below wriitten job are waiting and not executed
         //In Case Job2 is a long running process . In such case JVM/OS will give a msg that app is not responding
         // If we make our Mytask as thread then our will be solved.
        //Now main and mytask are executing both parallely and concurrently.  
         //job3
         for(int i=0;i<=10;i++){
              System.out.println("job3  "+i);

        }
        //job 4
        System.out.println("---Application finished");
    }
}

