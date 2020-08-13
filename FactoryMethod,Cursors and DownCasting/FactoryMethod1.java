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
class AnimalMethod{
Animal getAnimal(String animalName){
if(animalName.equals("Lion"))
return new Lion();
else if(animalName.equals("Elephant"))
return new Elephant();
else
return null;
}
}
class FactoryMethod1{
public static void main(String []args){
AnimalMethod am=new AnimalMethod();
Animal a=am.getAnimal(args[0]);
a.lifeSpan();
}
}
