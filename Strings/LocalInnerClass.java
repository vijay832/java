class University{
           void announcement(){
           System.out.println("Exams starts from August 20-2020");
           class Department{
           void examPapers(){
           System.out.println("Preparing Question Papers");
           }
           }
        Department eee=new Department();
        eee.examPapers();
      }
          
}
class LocalInnerClass{
public static void main(String []args){
University klu=new University();
klu.announcement();
}
}