package assignment_1;
import java.util.*;



public class TreeMapBook {
	public static void main(String[] args)
	{
		TreeMap<String, Author> books = new TreeMap<String, Author>();
		books.put("lion king",new Author(1,"monarch","cz-46"));
		books.put("worthless",new Author(2,"suraj","cz-86"));
		books.put("pagal sa rapper",new Author(3,"dips","eg-48"));
		books.put("meteor",new Author(4,"jon","ty-100"));
		books.put("drago",new Author(5,"jon","zxy-16"));
		System.out.println(books);
		Set<String> Keys = books.keySet();
		int size=books.size();
		
		String arr[] = new  String[size];
		int j=0;
		for(String i:Keys)
		{
			Author a = books.get(i);
		    Function1 obj = new Function1();
		    obj.Display(i, a.getName(), a.getAddress());
		    
		    
		    arr[j]=a.getName();
		    
		    j++;
		    
		    
			
		}
		Function1 obj1 = new Function1();
		obj1.countall(arr);
				
		
		
		
	}

}
