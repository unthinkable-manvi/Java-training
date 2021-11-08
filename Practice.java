public class Practice {
     int a=5;
     static int b=10;
     public static void python(){
         System.out.println("Hello I'm a python Method");
     }
     public void cpp(){
        System.out.println("Hello I'm a cpp Method");
    }
    // find greatest
    public void greatest(){
        int x=5;
        int y=10;
        int res=(x>y?x:y);
        System.out.println("greatest no. is"+res);
    }
    public static void main(String[] args) {
        Practice obj =new Practice();
        System.out.println(obj.a);
        System.out.println(b);
        Practice.python();
        obj.cpp();
        obj.greatest();
    }
}
