import java.io.*;
class BufferedFileExample{
public static void main(String []args) throws Exception{
FileOutputStream fo=new FileOutputStream("C:\\Users\\vijay\\Documents\\java course\\fileexample2.txt");
BufferedOutputStream bo=new BufferedOutputStream(fo);
String s="Welcome to java files"; 
byte[] x=s.getBytes();
bo.write(x);
bo.flush();
FileInputStream fi=new FileInputStream("C:\\Users\\vijay\\Documents\\java course\\fileexample2.txt");
BufferedInputStream bi=new BufferedInputStream(fi);
int y=bi.read();
while(y!=-1){
System.out.print((char)y);
y=bi.read();
}
bo.close();
bi.close();
}
}