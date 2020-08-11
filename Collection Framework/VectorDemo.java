/*Vector follows insertion order and all the methods are synchronized*/
import java.util.*;
class VectorDemo{
public static void main(String []args){
Vector<Integer> al=new Vector<Integer>();
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
System.out.println(al.get(5));
al.set(5,97);
System.out.println(al);
System.out.println(al.get(5));
al.remove(7);
System.out.println(al);
}
}
