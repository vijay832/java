class Car{
void cost(){
System.out.println(" No Cost");
}
void milage(){
System.out.println("No Milage");
}
}
class Audi extends Car{
int cost=40000;
int milage=15;
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
void cost(){
System.out.println("Cost of BMW is $"+cost);
}
void milage(){
System.out.println("Milage of BMW is "+milage+" Mph");
}
}
class MethodOverriding{
public static void main(String []args){
Car c;
c=new Audi();
c.cost();
c.milage();
c=new Bmw();
c.cost();
c.milage();
}
}
