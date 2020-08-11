//ArrayDeque follows insertion order and dublicates, null values, heterogenous elements are allowed
import java.util.*;
class ArrayDequeDemo{
public static void main(String []args){
ArrayDeque<String> pq=new ArrayDeque<String>();
pq.add("vijay");
pq.add("ajay");
pq.add("kumar");
pq.add("vinod");
pq.add("arun");
pq.add("sree");
pq.add("vijaya");
pq.add("sai");
pq.add("jagu");
pq.add("shiva");
pq.add("vikram");
pq.add("vijay");
pq.add("bharat");
pq.add("harish");
pq.add("teja");
System.out.println(pq);
}
}
