/*TreeHashMap follows ascending order
  dublicate values are allowed but dublicates keys are not allowed.*/
import java.util.*;
class TreeMapDemo{
public static void main(String []args){
TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
hm.put(103,"vijay");
hm.put(104,"vijay");
hm.put(123,"kumar");
hm.put(125,"prasad");
hm.put(106,"sree");
hm.put(103,"vinod");
hm.put(108,"ravi");
hm.put(110,"vijay");
hm.put(111,"ajay");
System.out.println(hm);
}
}