package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class arrary_practice {

	public boolean compare_arrary(String[] arr1, String[] arr2)
	{
		
		if (!Arrays.equals(arr1, arr2))
		{
			System.out.println("array not equal");
			return false;
		}

		else
		{
			System.out.println("array equal ");
			return true;
		}

		/*
		Using the handcrafted code
		if (arr1.length != arr2.length){
			System.out.println("array not equal in length");
			return false;
			}
		
		for(int i=0;i<arr1.length;i++)
		{

			if (arr1[i]!=arr2[i])
			{
				System.out.println("array not equal");
				return false;
			}
		}
		
		System.out.println("arrays are equal");
		return true;
		*/
	}


	public void sort_and_search(String[] arr1, String search_string)
	{
		Arrays.sort(arr1);
		
		for (String element : arr1)
		{
			System.out.println(element);
		}
		
		System.out.println(	Arrays.binarySearch(arr1,search_string));
		
	}
	
	public void reverse_array(String[] arr1)
	{
		
		ArrayList  al = new ArrayList(Arrays.asList(arr1));; 
		
		Collections.reverse(al);
	
		System.out.println(al);
		
		
		
	}
	
	
	

	
	public void insert_element_in_the_middle(String[] arr,String new_element)
	{
		String[] new_arr = new String[arr.length+1];
		
		int middle_place = arr.length/2;
		
		///print(middle_place);
		
		System.arraycopy(arr, 0, new_arr, 0, middle_place);
		
		new_arr[middle_place] = new_element;

		System.arraycopy(arr, middle_place, new_arr, middle_place+1,(middle_place*2)-2);
		
		for (String element : new_arr )
		{
			System.out.println(element);
		}
		
	}
	
	
	public static void print(String message)
	{
		System.out.println(message);
	}

	public static void print(int message)
	{
		System.out.println(message);
	}


	public  void init_arrar()
	{
		//int[] arr = {10,2,5,4};
		
		int[] arr = new int[6];
		
		Arrays.fill(arr, 100);
		
		for (int element : arr )
		{
			System.out.println(element);
		}
		
	}

	public  void extend_array()
	{
		int[] arr = {10,2,5,4};
		
		int[] extended = new int[arr.length+3];
		
		extended[arr.length] = -1;
		extended[arr.length+1] = -2;
		extended[arr.length+2] = -3;
		
		System.arraycopy( arr,0 , extended,0,arr.length);
		
		for (int element : extended )
		{
			System.out.println(element);
		}
		
	}

	public  void remove_array_element(int element_to_remove)
	{
		ArrayList arr = new ArrayList();
		
		arr.add(0,"This is me");
		arr.add(1,"Commited to earn 500 crore");
		arr.add(2,"By the age 50");
		arr.add(3,"And distrurb my work life balance in the process");
	
		System.out.println(arr);
		arr.remove(3);
		System.out.println(arr);
		
//		int[] arr = {10,2,5,4,7,8};
		
//		int[] shorter_arr = new int[arr.length-1];
		
//		System.arraycopy( arr,0 , shorter_arr,0,element_to_remove);
//		System.arraycopy( arr,element_to_remove +1, shorter_arr ,element_to_remove,arr.length-2);
		
/*		for (int element : arr)
		{
			System.out.println(element);
		}
	*/	
	}


	
	public void remove_arrays_element_based_on_another_array()
	{
		ArrayList arr = new ArrayList();
		
		arr.add(0,"This is me");
		arr.add(1,"Commited to earn 500 crore");
		arr.add(2,"By the age 50");
		arr.add(3,"And distrurb my work life balance in the process");

		ArrayList arr2 = new ArrayList();
		arr2.add(0,"And distrurb my work life balance in the process");
		
		arr.removeAll(arr2);
		
		System.out.println(arr);
	}
	
	public void find_common_elements()
	{
		ArrayList arr = new ArrayList();
		
		arr.add(0,"This is me");
		arr.add(1,"Commited to earn 500 crore");
		arr.add(2,"By the age 50");
		arr.add(3,"And distrurb my work life balance in the process");

		ArrayList arr2 = new ArrayList();
		
		arr2.add(0,"And distrurb my work life balance in the process");
		arr2.add(1,"Commited to earn 500 crore");
		
		
		arr.retainAll(arr2);
		
		System.out.println(arr);
	}

	public void search_for_the_element()
	{
		ArrayList arr = new ArrayList();
		
		arr.add(0,"This is me");
		arr.add(1,"Commited to earn 500 crore");
		arr.add(2,"By the age 50");
		arr.add(3,"And distrurb my work life balance in the process");
		
		System.out.println(		arr.contains("By the Age 50")); //case senetive
	}
	
	
	public void check_if_array_are_equal()
	{
		ArrayList arr = new ArrayList();
		ArrayList arr2 = new ArrayList();
		
		arr.add(0,"This is me");
		arr.add(1,"Commited to earn 500 crore");
		arr.add(2,"By the age 50");
		arr.add(3,"And distrurb my work life balance in the process");

		arr2.add(0,"This is me");
		arr2.add(1,"Commited to earn 500 crore");
		arr2.add(2,"By the age 50");
		arr2.add(3,"And distrurb my work life balance in the process");

		System.out.println(arr);
		System.out.println(arr2);
				
		System.out.println(arr.equals(arr2)); 
	}
	
}
