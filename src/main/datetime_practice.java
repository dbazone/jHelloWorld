package main;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Formatter;
import java.util.Calendar;
public class datetime_practice {

	public void show_time()
	{
		Date dt = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss a");
		System.out.println(sd.format(dt));
		
	}
	
	
	public void show_month()
	{
		Date dt = new Date();
		
		SimpleDateFormat sd = new SimpleDateFormat("MM");
		System.out.println(sd.format(dt));

		sd.applyPattern("MMM");
		System.out.println(sd.format(dt));

		sd.applyPattern("MMMM");
		System.out.println(sd.format(dt));

	}

	public void show_month_using_formatter()
	{
		Formatter fmt = new Formatter();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(fmt.format("%tB %tb %tm ", cal, cal, cal));
	}
	
	public void show_datetime_using_formatter()
	{
		Formatter fmt = new Formatter();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(fmt.format("%tk",cal));

	}

	public void show_weekdays_name()
	{
		DateFormatSymbols dfs = new DateFormatSymbols();
		
		String[] st = 	dfs.getWeekdays();
				
		for (String str : st)
		{
			 System.out.println(str);
		}
	}
	
	
	public void add_time_to_date()
	{
		Date dt = new Date();
		Calendar cal =Calendar.getInstance();
		
		cal.add(Calendar.DATE, -4);
		
		System.out.println(cal.getTime());
		
	}
}
