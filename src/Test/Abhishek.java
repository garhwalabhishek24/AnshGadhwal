package Test;

import java.util.ArrayList;
import java.util.List;

public class Abhishek {
	public static void main(String[] args) {
		String str = "The Collection in  is a framework c provides an architecture to store and manipulate the group of objects.";
	
		List<String> list = new ArrayList<>();
		String output [] = str.split("\\s");
		for (int j =0 ; j < output.length; j++) {
			list.add(output[j]);
			//System.out.println(list);
		}
		
		list.add(3, "python");
		//System.out.println(list);
		
		
		//System.out.println(list.size());
		
	 System.out.println(str);
		
		
	}

}
