abstract class Restaurant{
abstract void ordertype();
abstract void menu();
}
class KurryLeaves extends Restaurant{
String order="\nDrive_thru\nOnline\nTo_Go";
String menu="\n1.Idly\n2.Dosa\n3.Wada\n4.Chapathi";
void ordertype(){
System.out.println("Order types possible :"+order);
}
void menu(){
System.out.println("Menu of Kurry Leaves "+menu);
}
}
class Bawarchi extends Restaurant{
String order="\nDrive_thru\nTo_Go";
String menu="\n1.Idly\n2.Dosa\n3.Wada\n4.Chapathi\n5.Upma";
void ordertype(){
System.out.println("Order types possible :"+order);
}
void menu(){
System.out.println("Menu of Bawarchi : "+menu);
}
}
class MethodOverriding5{
public static void main(String []args){
Restaurant r;
r=new KurryLeaves();
r.ordertype();
r.menu();
r=new Bawarchi();
r.ordertype();
r.menu();
}
}
