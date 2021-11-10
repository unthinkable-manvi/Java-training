public class ExceptionSample {
     public static void main(String[] args) {

        // One try block have multiple catch block
         try{
             int x=35;
             int y=0;
             int res=x/y;
             System.out.println("ressult+= "+ res);

         }catch(ArithmeticException e){
             System.out.println("can't div by zero");

         }
         // Finally block is always executed either error is found or not
         
         try{
            String s=null;
            int t=s.length();
            System.out.println(t);
         }
         catch(NullPointerException e){
             System.out.println("can't determine the length of  null String ");
         }finally{
             System.out.println("put important code here!");
         }
     } 
}
