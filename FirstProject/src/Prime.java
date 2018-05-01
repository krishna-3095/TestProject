

public class Prime {
	
		 public static void main(String[] args) 
		   {	
			 int num = 2;
		        int counter = 1;
		        boolean flag = true;

		        while(counter < 10001)
		        {
		            flag = true;
		            num++;
		            for(int i = 2; i < num; i++)
		            {
		                if(num%i==0)
		                {
		                    flag = false;
		                }
		            }
		            if(flag)
		            {
		                counter++;
		            }
		        }
		        System.out.println(num);
		   }
		}


