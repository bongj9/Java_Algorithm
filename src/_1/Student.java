package _1;

import java.util.ArrayList;
import java.util.Scanner;

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
      Student stu1 = new Student("손오공","1682");
      Student stu2 = new Student("저팔계", "1772");
      Student stu3 = new Student("사오정", "1813");


      ArrayList<Student> list = new ArrayList<Student>();

      list.add(stu1);
      list.add(stu2);
      list.add(stu3);

      for (Student stu : list) {
         System.out.println(stu.getName());
         System.out.println(stu.getNo());

      }
      Scanner scan = new Scanner(System.in);
      while (true) {
         System.out.println("계속 검색을 하고싶으시면 y, 종료하고싶으면 n");
         boolean flag = false; //한번이라도 있었더라면 flag변수로 사용함 있으면 true로 반환

         String input = scan.next();
         if (input.equals("y")) {
            System.out.println("검색을 시작합니다.");
            String name = scan.next();//학생이름을 받기
            for (Student stu : list) {
               if (stu.getName().equals(name)) {  //Stu의 getname으로 반환한값이 name이랑 같냐를 확인함
                  System.out.println("해당하는 학생의 학번은: " +
                          stu.getNo());
                  flag = true;

                  if (!flag) {
                     System.out.println("해당하는 학생의 이름이 없습니다");

                  }
               }
            }
         } else if (input.equals("n")) {
            break;
         }
      }


/*      while (input.equals("y")) {
         System.out.println(stu1.getName());
      }*/
      System.out.println("종료되었습니다.");
      //Do-while문은 한번은 실행이 되어야할때 쓰는것


   }

}

