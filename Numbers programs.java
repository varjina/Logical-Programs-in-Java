import java.util.*;
public class Main
{
    static int findhHcf(int a,int b){
        while(b>0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int findLcm(int a,int b){
        int hcf=findhHcf(a,b);
        int lcm=a*b/hcf;
         return lcm;
    }
   
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(findhHcf( a,b));
		System.out.println(findLcm(a, b));
	}
}