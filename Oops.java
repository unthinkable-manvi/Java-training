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

    //Polymorphism : Allow us to perform the same action in many different forms.
    //Compile time polymorphism(We can achieve this by using  Method Overloading)
    public void marks(String Subject,int marks){
        System.out.println(Subject+" and "+marks);
    }
    public void marks(int marks){
        int per=(marks*100)/50;
        System.out.println("Hii I am "+this.name+" and I am secured this percentage "+per+"%");
    }
    public void marks(String subject){
        System.out.println("I know I am securing good marks in current Subject "+subject);
    }
    
}
// Run Time Polymorphism or Dynamic Polymorphism(We can achieve this by using Method Overriding).
// In which a call to an override method is resolved at runtime polymorphism in java.
//In this overridden method is called through the Refrence variable of Parent class refers to the Object of child class.
class Bike{
    public void run(){
        System.out.println("I am from Bike Class");
    }
}
class Honda extends Bike{
    public void run(){
        System.out.println("I am from Honda Class");
    }
}
class Pulsar extends Bike{
    public void run(){
        System.out.println("I am from Pulsar Class");
    }
}


//Inheritance
// In a Car Store one customer needs reacecar and other one need luxury Car
// For this we can create one class which have all the  coommon method
class Car{
    public void model(){
        System.out.println("hello I'm a method model");
    }
    public void insurance(){
        System.out.println("hello I'm a method insurane");
    }
}

class luxuryCar extends Car{
        public void design(){
            System.out.println("hello I'm a method design");
        }
}
class racecar extends Car{
    public void speed(){
        System.out.println("hello I'm a method speed");
    }   
}


public class Oops {
       public static void main(String[] args) {
           Students s1=new Students(21,"manvi");
           Students s2=new Students(22,"Harry");

           s1.displayData();
           s2.displayData();
           s1.marks("Java", 48);
           s1.marks(48);
           s1.marks("Java");
          Bike obj=new Honda();
           obj.run();
          Bike obj1=new Pulsar();
          obj1.run();
        //Inheritance
          luxuryCar lc=new luxuryCar();
           lc.design();
           lc.model();

           racecar rc=new racecar();
           rc.speed();
           rc.insurance();


       }
}
