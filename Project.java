import java.util.Scanner;
class Student{
  String sName;
  int sAge;
  int sRollNo;
  String sCourse;
  void setSName(String name){
    sName = name;
  }
  void setSAge(int age){
    sAge = age;
  }
  void setSRollNo(int rollno){
    sRollNo = rollno;
  }
  void setSCourse(String course){
    sCourse = course;
  }
  String getSName(){
    return sName;
  }
  int getSAge(){
    return sAge;
  }
  int getSRollNo(){
    return sRollNo;
  }
  String getSCourse(){
    return sCourse;
  }
}
public class Project{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of Students: ");
    int num = input.nextInt();
    Student[] studArray = new Student[num];
    for(int i=0; i<num; i++){
      System.out.println("Enter the details for Student " + (i+1));
      studArray[i] = new Student();
      System.out.print("\tEnter Name: ");
      studArray[i].setSName(input.next());
      System.out.print("\tEnter Age: ");
      studArray[i].setSAge(input.nextInt());
      System.out.print("\tEnter Roll No.: ");
      studArray[i].setSRollNo(input.nextInt());
      System.out.print("\tEnter Course: ");
      studArray[i].setSCourse(input.next());
    }
    System.out.println("Traversing the Input details for Student !!!");
    for(int i=0; i<num; i++){
      System.out.println("Showing details for Student " + (i+1));
      System.out.println("\tName: " + studArray[i].getSName());
      System.out.println("\tAge: " + studArray[i].getSAge());
      System.out.println("\tRoll No.: " + studArray[i].getSRollNo());
      System.out.println("\tCourse: " + studArray[i].getSCourse());
      try{
        Thread.sleep(1000);
      }
      catch(Exception e){}
    }
  }
}
