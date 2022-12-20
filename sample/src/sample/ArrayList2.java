package sample;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayList2 {

	public static void main(String[] args) 
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("sravan");
		names.add("super");
		names.add("suresh");
		names.add("ravi");
		int count=0; 		
		long c=names.stream().filter(a->a.startsWith("s")).count();
		System.out.println(c);
		long d=Stream.of("sravan","abcd","sandhya","serene").filter(a->a.startsWith("a")).count();
		System.out.println(d);
		names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
				
				
				
				
				
				
				
				
				
				
				
				
				

	} }
