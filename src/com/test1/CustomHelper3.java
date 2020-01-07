package com.test1;

import java.util.concurrent.Callable;

public class CustomHelper3 implements Callable{

	
	
	Integer limit;
	public CustomHelper3(Integer limit)
	{
		this.limit=limit;
	}
	
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return process1(limit);
	}
	
	
	public Integer process1(Integer count)
	{
		Integer sum=0;
		for(Integer k=count;k<=count+2000;k++)
		{
			System.out.println(k);
			System.out.println("hello Hello");
			sum+=k;
		}
		System.out.println("end of loop");
		return sum;
	}

}
