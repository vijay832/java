class WrapperDemo{
public static void main(String []args){
int i=100;
Integer j=new Integer(i);
System.out.println(i);
System.out.println(j);
float b=2.4f;
Float f=new Float(b);
System.out.println(b);
System.out.println(f);
Integer k=100;            //Auto-boxing
System.out.println(k);
int l=new Integer(100);   //Auto-unboxing
System.out.println(l);
}
}