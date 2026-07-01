import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo { 
	public static void main(String[] args) {
		//TODO:ArrayList examples..
		ArrayList<String> list = new ArrayList<String>(); 

		list.add(new String("Banana"));
		list.add("Apple");
		list.add("Cherry");

		Collections.sort(list);

		System.out.println("After sorting:");

		for(String s: list){
			System.out.println(s);
		}
		
		String Apple = list.get(0);
		System.out.println(Apple);
		list.remove(0);

		System.out.println("After remove:");

		for(String s: list){
			System.out.println(s);
		}

		System.out.println(list.contains("Apple"));
		 
	}
}
