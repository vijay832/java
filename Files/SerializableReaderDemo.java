import java.io.*;
class SerializableReaderDemo{
public static void main(String []args) throws Exception{
FileInputStream fi=new FileInputStream("C:\\Users\\vijay\\Documents\\java course\\Serializable.txt");
ObjectInputStream oi=new ObjectInputStream(fi);
Object o=oi.readObject();
Student vijay=(Student)o;
System.out.println(vijay.id+" "+vijay.name+" "+vijay.marks);
oi.close();
}
}