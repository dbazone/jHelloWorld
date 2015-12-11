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
	
	
	public void match_regions(String str, String str2)
	{
		
		System.out.println(str.regionMatches(5, str, 0, 9));
		
	}
	

	public void compare_string_perfromance()
	{
		
		long start_time, end_time;

		start_time = System.currentTimeMillis();
		
		
		for (int i =0 ; i<=500000;i++)
		{
			String str1 = "HELLO1";
			String str2 = "HELLO1";
		}
		end_time = System.currentTimeMillis();

		System.out.println("System performance in first attempt" + (end_time-start_time) );
		
		start_time = System.currentTimeMillis();
		for (int i =0 ; i<=500000000;i++)
		{
			String str3 = new String("HELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEE");
			String str4 = new String("HELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEEHELLO1 JEE");
		}

		end_time = System.currentTimeMillis();

		System.out.println("System performance in second attempt" + (end_time-start_time));

	}
	
	
	public void optimizing_string_creation()
	{
		String str_arr[] = new String[999999];
		long start_time, end_time;
		
		start_time= System.currentTimeMillis();
		
		for (int i=0;i<999999;i++)
		{
			str_arr[i] = "VIJAY";
		}

		end_time = System.currentTimeMillis();
		System.out.println( "Perfromance of String Literal : " + (end_time-start_time));

		start_time= System.currentTimeMillis();
		
		for (int i=0;i<999999;i++)
		{
			str_arr[i] = new String ("VIJAY");
		}

		end_time = System.currentTimeMillis();
		System.out.println( "Perfromance of String Object : " + (end_time-start_time));

		start_time= System.currentTimeMillis();
		
		for (int i=0;i<999999;i++)
		{
			str_arr[i] = new String ("VIJAY");
			str_arr[i] = str_arr[i].intern();
		}

		end_time = System.currentTimeMillis();
		System.out.println( "Perfromance of String Intern : " + (end_time-start_time));
		
	}
}
