abstract class Car{
abstract void cost();
abstract void milage();
}
class AnonymousDemo1{
public static void main(String []args){
Car audi=new Car(){
void cost(){
System.out.println("Cost of Audi is 50 lakhs");
}
void milage(){
System.out.println("Milage of Audi is 20 kmph");
}
};
Car bmw=new Car(){
void cost(){
System.out.println("Cost of Bmw is 40 lakhs");
}
void milage(){
System.out.println("Milage of Bmw is 15kmph");
}
};
audi.cost();
audi.milage();
bmw.cost();
bmw.milage();
}
}