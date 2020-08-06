class StringMethods{
public static void main(String []args){
String s="hello world";
System.out.println(s.isEmpty());
System.out.println(s.length());
String s1="";
System.out.println(s1.isEmpty());
String s2="HELLO WORLD";
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
String s3="     hello      ";
String s4="world";
System.out.println(s3);
System.out.print(s3.trim());
System.out.println(s4);
String s5="java follows oops and java is fully oops";
System.out.println(s5);
System.out.println(s5.substring(5));
System.out.println(s5.substring(5,15));
System.out.println(s5.replace("java","python"));
String s6="java follows oops, java is fully oops";
String x[]=s6.split(" ");
for(String k:x){
System.out.println(k);
}  
}
}