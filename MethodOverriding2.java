class Laptop{
void cost(){
System.out.println(" No Cost");
}
void model(){
System.out.println(" No Model");
}
void specifications(){
System.out.println("No Specifications");
}
}
class Lenovo extends Laptop{
int cost=1300;
String model="C740";
String specs="Corei7,16GB_RAM,1_TB_SSD" ;
void cost(){
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
System.out.println("Cost of DELL is $"+cost);
}
void model(){
System.out.println("Model of DELL is "+model);
}
void specifications(){
System.out.println("Specifications of DELL are "+specs);
}
}
class MethodOverriding2{
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
