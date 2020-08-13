class ExceptionDemo{
public static void main(String args[]){
int a=10,b=0;
String name="vijay";
System.out.println("Statement-1");
try{
System.out.println("Statement-2 and Division="+(a/b));
System.out.println("Statement-3 and Length of String is ="+name.length());
}
catch(ArithmeticException ae){
ae.printStackTrace();
}
catch(Exception np){
np.printStackTrace();
}
finally{
System.out.println("Finally block");
}
System.out.println("Statement-4");
System.out.println("Statement-5");
}
}
