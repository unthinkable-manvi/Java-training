public class PersonInterface  implements Student, Player {
    
    public static void main(String[] args) {
       PersonInterface obj=new PersonInterface();
       obj.marks();
       obj.footballer();

         
    }


public void marks(){
    System.out.println("Hello I'm marks method");
}
public void footballer(){
    System.out.println("Hello I'm a footballer");
}

}