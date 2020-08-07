import java.util.*;
class TreeSetDemo{
public static void main(String []args){
TreeSet<String> hs=new TreeSet<String>();
System.out.println(hs.isEmpty());
hs.add("vijay");
hs.add("ajay");
hs.add("prakash");  // Follows ascending order
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
System.out.println(hs.subSet("ajay",true,"srinu",true));
System.out.println(hs.tailSet("prakash",false));
System.out.println(hs.headSet("srinu",true));
}
}