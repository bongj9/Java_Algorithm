package _1;

import java.util.ArrayList;

public class Student {
   private String name;  //멤버변수는 웬만해서 private로 하는게 좋다
   private String no;


   public Student(String name, String no) {
      super();
      this.name = name;
      this.no = no;
   }
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getNo() {
      return no;
   }

   public void setNo(String no) {
      this.no = no;
   }

}


class main {
   public static void main(String[] args) {
      Student stu1 = new Student();
      Student stu2 = new Student();
      Student stu3 = new Student();


      ArrayList<Student> list = new ArrayList<Student>();

      list.add(stu1);
      list.add(stu2);
      list.add(stu3);
   }
}

