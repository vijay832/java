import java.util.Scanner;
class VoteDemo{
public static void main(String []args) throws Exception{
int age;
Scanner sc =new Scanner(System.in);
System.out.println("Enter age:");
age=sc.nextInt();
if(age>=18)
System.out.println("Eligible for voting");
else 
throw new Exception("Not Eligible for voting");
}
}

