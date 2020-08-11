//Stack is a sub-class of Vector 
import java.util.*;
class StackDemo{
public static void main(String []args){
Stack<String> s=new Stack<String>();
s.push("vijay");
s.push("ajay");
s.push("kumar");
s.push("vinod");
s.push("arun");
s.push("sree");
s.push("vijaya");
s.push("sai");
s.push("jagu");
s.push("shiva");
s.push("vikram");
s.push("vijay");
s.push("bharat");
s.push("harish");
s.push("teja");
System.out.println(s);
s.pop();
s.pop();
System.out.println(s);
}
}
