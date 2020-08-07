import java.util.*;
class LinkedHashSetDemo{
public static void main(String []args){
LinkedHashSet<String> hs=new LinkedHashSet<String>();
hs.add("vijay");
hs.add("ajay");
hs.add("prakash");  // Follows insertion order
hs.add("seetha");
hs.add("vikram");
hs.add("");
hs.add("balu");
hs.add("durga");
hs.add("vijay");
hs.add("srinu");
hs.add("madhu");
hs.add("akhi");
hs.add("ilahi");
hs.add("siddu");
hs.add("sai");
hs.add("praveen");
System.out.println(hs);
System.out.println(hs.size());
System.out.println(hs.isEmpty());
System.out.println(hs.contains("balu"));
System.out.println(hs.contains("jay"));
System.out.println(hs.remove("balu"));
System.out.println(hs.remove("jay"));
System.out.println(hs);
}
}