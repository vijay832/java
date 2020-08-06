class University{
        static class Department{
           void announcement(){
           System.out.println("Internal Exams starts from August 20-2020");
           }
          static void examPapers(){
           System.out.println("Preparing Question Papers");
           }
           }
                  
}
class StaticInnerDemo{
public static void main(String []args){
University.Department eee=new University.Department();
eee.announcement();
University.Department.examPapers();
}
}