abstract class Laptop{
abstract void cost();
abstract void model();
abstract void specifications();
void charger(){
System.out.println("We can't use Laptop without charging");
}
}
class Lenovo extends Laptop{
int cost=1300;
String model="C740";
String specs="Corei7,16GB_RAM,1_TB_SSD" ;
void cost(){
super.charger();
System.out.println("Cost of LENOVO $"+cost);
}
void model(){
System.out.println("Model of LENOVO is "+model);
}
void specifications(){
System.out.println("Specifications of LENOVO are "+specs);
}
}
class Dell extends Laptop{
int cost=1200;
String model="XPS_13";
String specs="Corei7,12GB_RAM,500_GB_SSD" ;
void cost(){
super.charger();
System.out.println("Cost of DELL is $"+cost);
}
void model(){
System.out.println("Model of DELL is "+model);
}
void specifications(){
System.out.println("Specifications of DELL are "+specs);
}
}
class MethodOverriding3{
public static void main(String []args){
Laptop l;
l=new Lenovo();
l.cost();
l.model();
l.specifications();
l=new Dell();
l.cost();
l.model();
l.specifications();
}
}
