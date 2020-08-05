interface Electronics{
void cost();
void displaysize();
}
abstract class Mobile implements Electronics{
void talk(){
System.out.println("Mobiles are used to make Phone calls");
}
}
abstract class Laptop implements Electronics{
void work(){
System.out.println("Laptops are used for Office work");
}
}
class Oneplus extends Mobile{
public void cost(){
System.out.println("Cost of Oneplus mobile is $700");
}
public void displaysize(){
System.out.println("Display Size of Oneplus is 5.5 inches");
}
}
class Samsung extends Mobile{
public void cost(){
System.out.println("Cost of Samsung mobile is $1000");
}
public void displaysize(){
System.out.println("Display Size of Samsung is 6.5 inches");
}
}
class Dell extends Laptop{
public void cost(){
System.out.println("Cost of Dell Laptop is $1200");
}
public void displaysize(){
System.out.println("Display Size of Dell Laptop is 13.3 inches");
}
}
class Lenovo extends Laptop{
public void cost(){
System.out.println("Cost of Lenovo Laptop is $1300");
}
public void displaysize(){
System.out.println("Display Size of Lenovo Laptop is 13.9 inches");
}
}
class InterfaceDemo1{
public static void main(String []args){
Mobile m;
m=new Oneplus();
m.talk();
m.cost();
m.displaysize();
m=new Samsung();
m.talk();
m.cost();
m.displaysize();
Laptop l;
l=new Dell();
l.work();
l.cost();
l.displaysize();
l=new Lenovo();
l.work();
l.cost();
l.displaysize();
}
}