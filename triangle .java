import java.util.Scanner;
public class Apcs201510Java {
	public static void main(String[] args) {
	int a,b,c,d,f,i,j,k;
	Scanner scanner=new Scanner(System.in);
	i=scanner.nextInt();
	j=scanner.nextInt();
	k=scanner.nextInt();
/*zone 1*/
		if(i>j&&i>k){
	   c=i;
	   b=j;
	   a=k;
				if(a+b>c){
				d=a*a+b*b;
		f=c*c;
					if(d==f){
			System.out.println("Right");
		}
					else if(d>f){
			System.out.println("Acute");
		}
					else{
			System.out.println("Obtuse");}
			
		}
		else{
	
	System.out.println("No");	
	}	
		}
/*zone2*/
		else if(j>k&&j>i){
	   c=j;
	   b=i;
	   a=k;
				if(a+b>c){
				d=a*a+b*b;
		f=c*c;
					if(d==f){
			System.out.println("Right");
		}
					else if(d>f){
			System.out.println("Acute");
		}
					else{
			System.out.println("Obtuse");}
			
		}
		else{
	
	System.out.println("No");	
	}	
		}
	/*zone 3*/
			else if(k>j&&k>i){
	   c=k;
	   b=i;
	   a=j;
				if(a+b>c){
				d=a*a+b*b;
		f=c*c;
					if(d==f){
			System.out.println("Right");
		}
					else if(d>f){
			System.out.println("Acute");
		}
					else{
			System.out.println("Obtuse");}
			
		}
		else{
	
	System.out.println("No");	
	}	
		}
	}
}