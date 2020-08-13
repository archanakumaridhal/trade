
    import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;
	import java.text.SimpleDateFormat;
	import java.time.*;


	public class Trade_Related {
		public static void main(String[] args) {
			
		List<Integer> version = new ArrayList<Integer>();
		version.add(1);
		version.add(2);
		version.add(3);
		try
		{
		  for(int i = 0; i<version.size();i++)	
		  {
			  if(version.get(i)<=1)
			  {
				  System.out.println("Version is rejected");
			  }
			  
		  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		@SuppressWarnings("deprecation")
		Date d = new Date(2020,05,20);
		Date today =new Date();
		System.out.println("Current date is " + today);
		boolean b = d.before(today);
		System.out.println("Trade not allowed " + b);
		
		}
	}

