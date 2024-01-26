package PriorityQueue;

import java.util.PriorityQueue;

public class clasrom2 {
    static class Student2 implements Comparable<Student2>{
        String name;
        int rollno;

        public Student2(String name, int rollno){
         this.name= name;
         this.rollno=rollno;
        }

        @Override
        public int compareTo(Student2 s3){
        return this.rollno-s3.rollno;
        }
    }


    public static void main(String[] args) {
        PriorityQueue<Student2> ppq= new PriorityQueue<>();

        ppq.add(new Student2("shivam", 110));
        ppq.add(new Student2("gagun", 101));
        ppq.add(new Student2("songu", 291));
        

        while (!ppq.isEmpty()) {
            System.out.println(ppq.peek().name+"->"+ppq.peek().rollno);
            ppq.remove();
        }
    }
}
