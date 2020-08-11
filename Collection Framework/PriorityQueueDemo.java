//Priority Queue follows random order and duplicates,null values and heterogenous elements are allowed.
import java.util.*;
class PriorityQueueDemo{
public static void main(String []args){
PriorityQueue<String> pq=new PriorityQueue<String>();
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
