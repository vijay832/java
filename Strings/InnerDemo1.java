class University{
           void announcement(){
           System.out.println("Exams starts from August 20-2020");
           Department eee=new Department();
           eee.examPapers();
           }
           class Department{
           void examPapers(){
           System.out.println("Preparing Question papers ");
           }
           }
}
class InnerDemo1{
public static void main(String []args){
University klu=new University();
klu.announcement();
}
}