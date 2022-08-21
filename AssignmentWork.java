import java.util.Scanner;

public class AssignmentWork {
	public static void main(String[] args) {
		System.out.println("Enter 1:Palindrome \nEnter 2:Pattern \nEnter 3:Prime \nEnter 4:Fibonacci Series \n");
		Scanner scanner2 = new
				Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = scanner2.nextInt();
		Scanner scanner1 = new
				Scanner(System.in);
		System.out.println("Enter the operation :");
		int number = scanner1.nextInt();
		switch (number) {
		  case 1:
			  int sum = 0;
			  int r;
			  int temp=n;    
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
				  System.out.println("palindrome number ");    
			  else    
				  System.out.println("not palindrome"); 
		    break;
		  case 2:
			  
			  for (int i= n-1; i>=0 ; i--)  
			  {  
			  for (int j=0; j<=i; j++)
				  {   
				  	System.out.print("*" + " ");  
				  		}    
			  	System.out.println();  
			  }
		    break;
		  case 3:
			  int i,m=0,check=0;        
			  m=n/2;      
			  if(n==0||n==1){  
			   System.out.println(n+" is not prime number");      
			  }
			  else{  
			   for(i=2;i<=m;i++){      
			    if(n%i==0){      
			     System.out.println(n+" is not prime number");      
			     check=1;      
			     break;      
			    }      
			   }      
			   if(check==0)  { System.out.println(n+" is prime number"); }  
			  }//end of else  
			 break;
		  case 4:
			  int k = 1, firstTerm = 0, secondTerm = 1;
			  while (k <= n) {
			      System.out.print(firstTerm + ", ");

			      int nextTerm = firstTerm + secondTerm;
			      firstTerm = secondTerm;
			      secondTerm = nextTerm;

			      k++;
			    }
			  
			 break;
	
		}
	
	}
}
