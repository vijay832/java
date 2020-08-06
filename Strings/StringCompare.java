class StringCompare{
public static void main(String []args){
String s="admin";
String s1="admin";
String s2="ADMIN";
String s3="B";
String s4="A";
String s5="C";
System.out.println(s.equals(s1));
System.out.println(s.equals(s2));
System.out.println(s.equalsIgnoreCase(s2));
System.out.println(s==s1);
System.out.println(s1==s2);
System.out.println(s4.compareTo(s3));
System.out.println(s5.compareTo(s3));
}
}
