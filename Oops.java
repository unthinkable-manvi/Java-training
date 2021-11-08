class Students{
    int age;// Data Member  
    String name;
    /*  constructor in java(whenever the new object is initialized a constructor is called.
        If we are not providing any constructor to it java provide a default constructor to it )*/
   
        Students(int age,String name){ //Parameterized Constructor
       this.name=name;  //this provided a reference to a newly creating object. 
       this.age=age;
    }
   /* Students(){//non-parametrized Constructor
        System.out.println("constructor is called");
    } */   
    public void displayData(){
        System.out.println("student name is "+this.name+" and his/her age is "+this.age);
    }
}
public class Oops {
       public static void main(String[] args) {
           Students s1=new Students(21,"manvi");
           Students s2=new Students(22,"Harry");

           s1.displayData();
           s2.displayData();
       }
}
