package main;

public class methods {
	
	public void fibonacci(int upper_limit)
	{
		int prev_2 = 0;
		int prev_1=1;
		while (prev_1<upper_limit)
		{

			
			prev_1 = prev_1+prev_2;
			prev_2 = prev_1 ;
			System.out.println(" " + (prev_1));
			 
			
		}
			
	}
}
