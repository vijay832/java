abstract class Animal{
abstract void lifeSpan();
void breath(){
System.out.println("Can't survive without breathing");
}
}
class Lion extends Animal{
int lifespan= 20;
void lifeSpan(){
super.breath();
System.out.println("lifespan of Lion is "+lifespan+" years");
}
}
class Elephant extends Animal{
int lifespan=30;
void lifeSpan(){
super.breath();
System.out.println("lifespan of Elephant is "+lifespan+" years");
}
}
class MethodOverriding4{
public static void main(String []args){
Animal a;
a=new Lion();
a.lifeSpan();
a=new Elephant();
a.lifeSpan();
}
}
