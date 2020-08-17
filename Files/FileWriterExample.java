import java.io.*;
class FileWriterExample{
public static void main(String []args) throws Exception{
FileWriter fw=new FileWriter("C:\\Users\\vijay\\Documents\\java course\\fileexample3.txt");
String s="Welcome to java FileWriter"; 
fw.write(s);
fw.flush();
fw.close();
FileReader fr=new FileReader("C:\\Users\\vijay\\Documents\\java course\\fileexample3.txt");
int x=fr.read();
while(x!=-1){
System.out.print((char)x);
x=fr.read();
}
fr.close();
}
}