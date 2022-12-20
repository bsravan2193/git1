package sample;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) 
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("sravan");
		names.add("super");
		names.add("suresh");
		names.add("ravi");
		int count=0;
		
		for (int i=0;i<names.size();i++)
		{
			if(names.get(i).startsWith("s"))
			{
				count=count+1;
			}
		}
		System.out.println(count); 	
		
		

	} }
