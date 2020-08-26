package Na;

public class Hw {
		  public static void main(String[] args) 
		    {
		       char Alphabet = 'A';
		       int n = 4;
		         
		        System.out.println("Here is your pattern....!!!");
		         
		        for (int i =1 ; i<=n;++i) 
		        {
		            for (int j = 1; j<=i; ++j)
		            {
		                System.out.print(Alphabet+" ");
		            }
		            ++Alphabet;
		             
		            System.out.println();
		        }
		         
		    }
		}
