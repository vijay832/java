//Cursor ListIterator
import java.util.*;
class CursorListiteratorDemo{
public static void main(String []args){
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(23);
al.add(22);
al.add(20);
al.add(13);
al.add(23);
al.add(24);
al.add(29);
al.add(31);
al.add(33);
al.add(44);
al.add(25);
al.add(55);
al.add(99);
al.add(66);
al.add(77);
al.add(21);
System.out.println(al);
ListIterator<Integer> li=al.listIterator();
while(li.hasNext()){
System.out.println(li.next());
}
System.out.println("==========================");
while(li.hasPrevious()){
System.out.println(li.previous());
}
}
}
