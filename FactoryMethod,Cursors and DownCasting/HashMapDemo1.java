import java.util.*;
class HashMapDemo1{
public static void main(String []args){
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(103,"vijay");
hm.put(104,"shiva");
hm.put(123,"kumar");
hm.put(125,"prasad");
hm.put(106,"sree");
hm.put(103,"vinod");
hm.put(108,"ravi");
hm.put(110,"vijay");
hm.put(111,"ajay");
System.out.println(hm);
Set<Map.Entry<Integer,String>>st=hm.entrySet();
Iterator i=st.iterator();
while(i.hasNext()){
Map.Entry mp=(Map.Entry)i.next();
System.out.println(mp.getKey());
System.out.println(mp.getValue());
}
}
}