class Mobile{
void cost(){
System.out.println(" No Cost");
}
void model(){
System.out.println("No model");
}
}
class Iphone extends Mobile{
int cost=1000;
String model="XS_MAX";
void cost(){
System.out.println("Cost of Iphone is $"+cost);
}
void model(){
System.out.println("Model of Iphone is "+model);
}
}
class Samsung extends Mobile{
int cost=800;
String model="S10";
void cost(){
System.out.println("Cost of Samsung is $"+cost);
}
void model(){
System.out.println("Model of Samsung is "+model);
}
}
class MethodOverriding1{
public static void main(String []args){
Mobile m;
m=new Iphone();
m.cost();
m.model();
m=new Samsung();
m.cost();
m.model();
}
}
