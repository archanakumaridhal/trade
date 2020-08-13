package Test_NG;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Trade {
	
	@Test
	public void test1()
	{
		List<Integer> version = new ArrayList<Integer>();
		version.add(1);
		version.add(2);
		version.add(3);
		Assert.assertEquals(2, 1,"Version is rejected");
	}
	
	@Test
	public void test2()
	{
		List<Integer> version = new ArrayList<Integer>();
		version.add(1);
		version.add(2);
		version.add(3);
		Assert.assertEquals(2, 2,"Version is accepted");
	}
	
	@Test
	public void test3()
	{
		//Hard Assert Example:
		System.out.println("Test 2 started");
		@SuppressWarnings("deprecation")
		Date d = new Date(2020,05,20);
		Date today =new Date();
		System.out.println("Current date is " + today);
		boolean b = d.before(today);
		assertFalse(b);
		System.out.println("Test 2 completed");  //It will terminate the program this lined will not execute
	}
	
	@Test
	public void test4()
	{
		//Hard Assert Example:
		System.out.println("Test 3 started");
		@SuppressWarnings("deprecation")
		Date d = new Date(2020,05,20);
		Date today =new Date();
		System.out.println("Current date is " + today);
		boolean b = d.before(today);
		assertTrue(b);
		System.out.println("Test 3 completed");  //It will terminate the program this lined will not execute
	}
}
