import java.util.Scanner;
interface SetStudent{
  void setSName(String name);
  void setSAge(int age);
  void setSRollNo(int rollno);
  void setSCourse(String course)
  void setSAdd(String add);
}
abstract class RawStudent{
  String sName;
  int sAge;
  int sRollNo;
  String sCourse;
  String sAdd;
  public String getSName(){
    return sName;
  }
  public int getSAge(){
    return sAge;
  }
  public int getSRollNo(){
    return sRollNo;
  }
  public String getSCourse(){
    return sCourse;
  }
  public String getSAdd(){
  }
}
class Student extends RawStudent implements SetStudent{

  public void setSName(String name){
    sName = name;
  }
  public void setSAge(int age){
    sAge = age;
  }
  public void setSRollNo(int rollno){
    sRollNo = rollno;
  }
  public void setSCourse(String course){
    sCourse = course;
  }
  public void setSAdd(String Add){
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
      System.out.print("\tEnter Add: ");
      studArray[i].setSAdd(input.next());
    }
    System.out.println("Traversing the Input details for Student !!!");
    for(int i=0; i<num; i++){
      System.out.println("Showing details for Student " + (i+1));
      System.out.println("\tName: " + studArray[i].getSName());
      System.out.println("\tAge: " + studArray[i].getSAge());
      System.out.println("\tRoll No.: " + studArray[i].getSRollNo());
      System.out.println("\tCourse: " + studArray[i].getSCourse());
      System.out.println("\tAdd: " + studArray[i].getSAdd());
      
      try{
        Thread.sleep(1000);
      }
      catch(Exception e){}
    }
  }
}
