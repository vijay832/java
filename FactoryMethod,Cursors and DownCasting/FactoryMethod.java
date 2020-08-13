//static factory method
abstract class Car{
abstract void cost();
abstract void milage();
void start(){
System.out.println("Starts with a key");
}
}
class Audi extends Car{
void cost(){
System.out.println("Cost of Audi is 40lakhs");
}
void milage(){
System.out.println("Milage of Audi is 15kmph");
}
}
class Bmw extends Car{
void cost(){
System.out.println("Cost of BMW is 50lakhs");
}
void milage(){
System.out.println("Milage of BMW is 18kmph");
}
}
class CarFactory{
static Car getCar(String carName){
if(carName.equals("Audi"))
return new Audi();
else if(carName.equals("Bmw"))
return new Bmw();
else 
return null;
} 
}
class FactoryMethod{
public static void main(String args[]){
Car x=CarFactory.getCar(args[0]);
x.start();
x.cost();
x.milage();
}
}
