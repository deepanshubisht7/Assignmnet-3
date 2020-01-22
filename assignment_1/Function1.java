package assignment_1;

public class Function1 {
	public void Display(String s, String name, String addr) {
		System.out.println(s+" Written by "+name+" Residing at "+addr);
	}
	public void countall(String arr[]) {
		String occurence="";
		
		int max = 0;
		for (int y = 0; y < arr.length; y++) {
		       int count = 0;
		       for (int z = 0; z < arr.length; z++) {
		         if (arr[y]==arr[z])
		             count++;
		   }
		  if (count >= max) {
			  max = count;
			  occurence=arr[y];
		  }
		      
		  
		 }
		System.out.println(occurence);
		
	}

}
