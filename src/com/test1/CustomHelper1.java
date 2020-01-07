package com.test1;

public class CustomHelper1 implements Runnable{

	Integer limit;
	public CustomHelper1(Integer limit)
	{
		this.limit=limit;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		process1(limit);
	}
	
	
	public void process1(Integer count)
	{
		for(Integer k=count;k<=count+10000000;k++)
		{
			System.out.println(k);
		}
		System.out.println("======== end of loop ========");
	}

}
