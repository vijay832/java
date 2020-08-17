import java.io.*;
class Student implements Serializable{
int id;
String name;
int marks;
public Student(int id,String name,int marks){
this.id=id;
this.name=name;
this.marks=marks;
}
}
class SerializableDemo{
public static void main(String []args) throws Exception{
FileOutputStream fo=new FileOutputStream("C:\\Users\\vijay\\Documents\\java course\\Serializable.txt");
ObjectOutputStream op=new ObjectOutputStream(fo);
Student vijay=new Student(6124,"vijay",961);
op.writeObject(vijay);
op.close();
}
}
