import java.io.*;
class BufferedWriterExample{
public static void main(String []args) throws Exception{
FileWriter fw=new FileWriter("C:\\Users\\vijay\\Documents\\java course\\fileexample3.txt");
BufferedWriter bw=new BufferedWriter(fw);
String s="Welcome to java Buffered Writer and Reader"; 
bw.write(s);
bw.close();
FileReader fr=new FileReader("C:\\Users\\vijay\\Documents\\java course\\fileexample3.txt");
BufferedReader br=new BufferedReader(fr);
int x=br.read();
while(x!=-1){
System.out.print((char)x);
x=br.read();
}
br.close();
}
}