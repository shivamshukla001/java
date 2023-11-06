package oops;

public class one {
    

    public static void main(String[] args) {
        // Pen sh=new Pen();

        // sh.setColor("blue");
        // System.out.println(sh.color);
        
        // sh.setTip(10);
        // System.out.println(sh.tip);

        Student sh= new Student("shivam");
        // System.out.println(sh.name);

        Student sh2=new Student();


        Student sh3= new Student(123);
        // System.out.println(sh3.rollno);

    }
}

// class Pen{
//     String color;
//     int tip;

//     void setColor(String newColor){
//       color= newColor;
//     }

//     void setTip(int newTip){
//         tip=newTip;
//     }
// }

class Student {
    String name;
    int rollno;


    //Constructor
     Student(){
        System.out.println("the constructor is called");
    }
    Student(String name){
       this.name=name;
    }
    Student(int rollno){
       this.rollno=rollno;
    }

}