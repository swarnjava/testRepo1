package com.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.test1.CustomHelper1;
import com.test1.CustomHelper2;

public class Executor {

	public static void main(String[] args)
	{
		try
		{
		
		ExecutorService executorService=Executors.newCachedThreadPool();
		
		/*CustomHelper1 cHelper1=new CustomHelper1(10);
		executorService.execute(cHelper1);*/
		
		
		CustomHelper2 cHelper2=new CustomHelper2(101);
		Future<Integer> future = executorService.submit(cHelper2);
		executorService.shutdown();
		
		for(int k=10;k<100;k++)
		{
			System.out.println("############  "+k);
		}
		
		
		System.out.println("Result Sum: "+future.get().intValue());
		
		
		System.out.println("================= End Of Program ========================");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
