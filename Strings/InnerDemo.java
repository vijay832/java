class University{
           void announcement(){
           System.out.println("Exams starts from August 20-2020");
           }
           class Department{
           void examPapers(){
           System.out.println("Preparing Question Papers");
           }
           }
}
class InnerDemo{
public static void main(String []args){
University klu=new University();
University.Department eee=klu.new Department();
klu.announcement();
eee.examPapers();
}
}