class StringMutable{
public static void main(String []args){
String s=new String("vijay");
String x=s.concat("kumar");
System.out.println(s);
System.out.println(x);
StringBuffer sb=new StringBuffer("vijay");
sb.append("kumar");
System.out.println(sb);
StringBuilder sf=new StringBuilder("vijay");
sf.append("kumar");
System.out.println(sf);
}
}

