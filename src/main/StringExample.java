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
	
	public String clean_string(String str1, String str2_to_be_replaced)
	{
		String new_str="";
		
		new_str = str1.replace(str2_to_be_replaced, "");
		return new_str;
		
	}
	
	public String replace_string(String str1, String str2_to_be_replaced, String str3_which_will_replace)
	{
		String new_str="";
		
		new_str = str1.replace(str2_to_be_replaced, str3_which_will_replace);
		return new_str;
		
	}
	
	public String string_reverse(String str)
	{
		String str_rev = new StringBuffer(str).reverse().toString();
				//.reverse().toString();
	
		
		return str_rev;
		
		
//		String str ="PERSISTENCE IS KEY TO SUCCESK";
//		String str_rev = "";
//		
//		int i =str.length();
//		
//		
//		
//		while (i>0)
//		{
//			i--;
//		//	System.out.println(i);
//	//		System.out.println(str.substring(28,29));
//			
//			str_rev= str_rev + str.substring(i,i+1);
//			
//		}
//		
//		
//		System.out.println(str_rev);
	}
	

	
	public int string_search(String str, String what_to_find)
	{
				
		return str.indexOf(what_to_find);
		
	}
	
	
	
	public void string_to_upper(String str)
	{
		
		
		System.out.println(str.toUpperCase());
		
		
	}
	
	public void split_sentence(String str, String delimeter )
	{
		
		String[] str_arr;
		str_arr= str.split(delimeter);
		
				for (String word:str_arr)
				{
					System.out.println(word);
				}
				
	}
	
}
