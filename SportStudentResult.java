interface Student
{
 int score=30;
 void displayscore();
}

interface Sports
{
 int score=20;
 void displaysportscore();
}
class Result implements Student,Sports
 {
  public void displayscore()
   { 
    System.out.println("Academic score is:"+Student.score);
   }
  public void displaysportscore()
   {
    System.out.println("Sport score is:"+Sports.score);
   }
 }
 
 public class SportStudentResult
  {
   public static void main(String args[])
    {
     Result r=new Result();
     r.displayscore();
     r.displaysportscore();
    }
   }
