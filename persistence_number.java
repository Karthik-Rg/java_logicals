import java.util.*;

public class Main

{
	
public static void main(String[] args) 

	{
		
Scanner key = new Scanner(System.in);
		
String num_str = key.next();
		
int x = num_str.length();
		
int num = Integer.parseInt(num_str);
		
int count = 0;
		
//int[] last_digit = new int[num_str.length()+1];
		
//int prod = 1;
		
//int[] whole_prod = new int[num_str.length()+1];
		
//whole_prod[i] = prod;

	/*	if(Integer.toString(prod).length()!=0);
		   
 System.out.print(prod);*/
		
/*for(int i = num_str.length(); i>0 ; i--)
		
System.out.print(whole_prod[i]);*/
		
System.out.println(calc(num,x,count));

	}
	
static int calc(int num, int x,int count)
  
  {
            
            
int[] digit = new int[10];
            
int prod = 1;
           
 count++;
	       
 for(int i = x; i>0 ; i--)
	      
  {
	            
	          
  digit[i] = num%10;
	           
 num = num/10;
	       
 }
	        
for(int i = x; i>0 ; i--)
	
        {
	            
//int prod;
	         
   prod = prod*digit[i];
	
	    	//prod = prod/10;
		
        //System.out.print(whole_prod[i]);

		        //return prod;
		
    }
		
if(Integer.toString(prod).length()>1)
	
	{
		    
		   
 calc(prod,Integer.toString(prod).length(),count);
	
	    //System.out.println(count++);
		
    //return prod;
		
}
		
else
		
{
		   
// return prod;
		
}
		
return 0;
	
}

}