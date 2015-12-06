package main;

public class StringExample {
	public boolean equals(String str1, String str2)
	{
		return str1.equals(str2);
		
//		if (str1 == str2)
//		{
//			return true;
//		}
//		else
//		{
//			return false; 
//		}
	}
	
	public int find_last_occurance(String str1, String str2)
	{
		return str1.lastIndexOf(str2,3);
	}
}
