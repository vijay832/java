class Car{
void cost(){
System.out.println(" No Cost");
}
Car(String model){
System.out.println("Car "+model);
}
void milage(){
System.out.println("No Milage");
}
}
class Audi extends Car{
int cost=40000;
int milage=15;
Audi(String model){
super("starts with key");
System.out.println("Model of Audi is "+model);
}
void cost(){
System.out.println("Cost of Audi is $"+cost);
}
void milage(){
System.out.println("Milage of Audi is "+milage+" Mph");
}
}
class Bmw extends Car{
int cost=50000;
int milage=13;
Bmw(String model){
super("starts with key");
System.out.println("Model of Bmw is "+model);
}
void cost(){
System.out.println("Cost of BMW is $"+cost);
}
void milage(){
System.out.println("Milage of BMW is "+milage+" Mph");
}
}
class MethodOverriding7{
public static void main(String []args){
Car c;
c=new Audi("AUDI_A8");
c.cost();
c.milage();
c=new Bmw("BMW_M8");
c.cost();
c.milage();
}
}
