abstract class Restaurant{
abstract void takeOrder(String order);
abstract void takeOrder(String order1,String order2);
}
class KurryLeaves extends Restaurant{
void takeOrder(String order1,String order2){
System.out.println("Order given is :"+order1+" and "+order2);
}
void takeOrder(String order){
System.out.println("Order given is :"+order);
}
}
class AbstractOverloading{
public static void main(String []args){
Restaurant r;
r=new KurryLeaves();
r.takeOrder("Idly");
}
}
