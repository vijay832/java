//Cursors Iterator
import java.util.*;
class CursorIteratorDemo{
public static void main(String []args){
HashSet<String> hs=new HashSet<String>();
hs.add("vijay");
hs.add("ajay");
hs.add("prakash");  // Follows random order
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
Iterator<String> i=hs.iterator();
while(i.hasNext()){
System.out.println(i.next());
}
}
}