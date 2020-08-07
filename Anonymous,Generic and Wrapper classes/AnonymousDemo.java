abstract class Person{
abstract void eat();
}
class AnonymousDemo{
public static void main(String []args){
Person vijay=new Person(){
void eat(){
System.out.println("Eating ice cream");
}
};
vijay.eat();
}
}

