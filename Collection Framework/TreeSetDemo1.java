import java.util.*;
class TreeSetDemo1{
public static void main(String []args){
TreeSet<Float> hs=new TreeSet<Float>();
hs.add(20.4f);
hs.add(30.6f);
hs.add(40f);          // Follows ascending order
hs.add(100.8f);
hs.add(200.86f);
hs.add(190.6f);
hs.add(300.20f);
hs.add(9.45f);
hs.add(9.5f);
hs.add(20.8f);
hs.add(6.1f);
hs.add(23.3f);
hs.add(44.2f);
hs.add(33.4f);
hs.add(22.7f);
hs.add(11.0f);
System.out.println(hs);
System.out.println("The first element is "+hs.first());
System.out.println("The last element is "+hs.last());
System.out.println("The greatest element which strictly less than to given element is "+hs.lower(100f));
System.out.println("The floor is "+hs.floor(10.0f));
System.out.println("The ceiling is "+hs.ceiling(101.1f));
System.out.println("The lowest element which is strictly greater than given element is "+hs.higher(100f));
System.out.println("The pollfirst element is "+hs.pollFirst());
System.out.println(hs);
System.out.println("The polllast element is "+hs.pollLast());
System.out.println(hs);
}
}