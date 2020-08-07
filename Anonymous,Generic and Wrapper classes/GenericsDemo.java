class GenericsDemo<E>{
void amount(E a){
System.out.println("Amount is" +a);
}
public static void main(String []args){
Sample<Integer> i=new Sample<Integer>();
i.amount(10000);
Sample<Float> f=new Sample<Float>();
f.amount(10000.500f);
Sample<String> s=new Sample<String>();
s.amount("Ten Thousand Rupees");
}
}