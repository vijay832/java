interface Vehicle{
void cost();
void milage();
}
abstract class Car implements Vehicle{
void wipers(){
System.out.println("Wipers to clean the window ");
}
}
abstract class Bike implements Vehicle{
void stand(){
System.out.println("Stand to support the Bike");
}
}
class Audi extends Car{
public void cost(){
System.out.println("Cost of Audi is $40000");
}
public void milage(){
System.out.println("Milage of Audi is 15 MPH");
}
}
class Bmw extends Car{
public void cost(){
System.out.println("Cost of BMW is $50000");
}
public void milage(){
System.out.println("Milage of BMW is 20 MPH");
}
}
class Harley extends Bike{
public void cost(){
System.out.println("Cost of Harley is $20000");
}
public void milage(){
System.out.println("Milage of Harley is 30 MPH");
}
}
class Hayabusa extends Bike{
public void cost(){
System.out.println("Cost of Hayabusa is $30000");
}
public void milage(){
System.out.println("Milage of Hayabusa is 20 MPH");
}
}
class InterfaceDemo{
public static void main(String []args){
Car c;
c=new Audi();
c.wipers();
c.cost();
c.milage();
c=new Bmw();
c.wipers();
c.cost();
c.milage();
Bike b;
b=new Harley();
b.stand();
b.cost();
b.milage();
b=new Hayabusa();
b.stand();
b.cost();
b.milage();
}
}
