import java.io.*;
class FileExample{
public static void main(String []args) throws Exception{
FileOutputStream fo=new FileOutputStream("C:\\Users\\vijay\\Documents\\java course\\fileexample.txt");
fo.write(65);
FileInputStream fi=new FileInputStream("C:\\Users\\vijay\\Documents\\java course\\fileexample.txt");
int x=fi.read();
System.out.println(x);
System.out.println((char)x);
String s="Welcome to files concept";
byte[] y=s.getBytes();
fo.write(y);
int z=fi.read();
while(z!=-1){
System.out.print((char)z);
z=fi.read();
}
fi.close();
}
}
