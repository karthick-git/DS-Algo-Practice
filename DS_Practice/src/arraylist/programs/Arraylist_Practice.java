package arraylist.programs;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Practice {

	//Write a Java program to create a new array list, add some colors (string) and print out the collection
	
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Black");
		arr.add("White");
		arr.add("Green");
		arr.add("Blue");
		arr.add("Red");
		System.out.println(arr);
		
	//Write a Java program to iterate through all elements in a array list.
		for(String i:arr) {
			System.out.println(i);
		}
		
	//Write a Java program to insert an element into the array list at the first position.
		arr.add(0, "Orange");
		System.out.println(arr);
		
	//Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println(arr.get(2));
		
	//Write a Java program to update specific array element by given element.
		arr.set(2, "Violet");
		System.out.println(arr);
		
	//Write a Java program to remove the third element from a array list.
		arr.remove(2);
		System.out.println(arr);
		
	//Write a Java program to search an element in a array list.
		System.out.println(arr.contains("Red"));

	//Write a Java program to sort a given array list
		//arr.sort(null);
		Collections.sort(arr);
		System.out.println(arr);
		
	//Write a Java program to copy one array list into another.
		//ArrayList<String> duparr = new ArrayList<String>(arr);
		ArrayList<String> duparr = new ArrayList<String>(9);
		duparr.add("Yellow");
		duparr.add("Brown");
		Collections.copy(arr, duparr);
		System.out.println(arr);
		//Note: if the no. of elements in the dest array are less than the source array, then index out of bound exception will be thrown
		
	//Write a Java program to shuffle elements in a array list
		
		Collections.shuffle(arr);
		System.out.println(arr);
		
	//Write a Java program to reverse elements in a array list
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr);
		
	//Write a Java program to extract a portion of a array list
		System.out.println(arr.subList(1, 3));

	//Write a Java program to compare two array lists
		ArrayList<String> arr2 = new ArrayList<String>(arr);
		arr2.remove(2);
		ArrayList<String> arr3 = new ArrayList<String>();
		for(String i: arr) {
			arr3.add(arr2.contains(i)?"Yes":"No");
		}
		System.out.println(arr3);
		//System.out.println(arr.equals(arr2));
		
	//Write a Java program of swap two elements in an array list.
		Collections.swap(arr, 0, 2);
		System.out.println(arr);
		
	//Write a Java program to join two array lists
		arr.addAll(arr3);
		System.out.println(arr);
		
	//Write a Java program to clone an array list to another array list
		Object arrclone;
		arrclone=arr2.clone();
		System.out.println(arrclone);
		
	//Write a Java program to empty an array list.
		arr2.clear();
		System.out.println(arr2);
		
	//Write a Java program to test an array list is empty or not.
		System.out.println(arr2.isEmpty());
		//or
		String check = arr2.size()>0?"No":"Yes";
		System.out.println(check);
		
	//Write a Java program to trim the capacity of an array list the current list size
		ArrayList<String> arr4 = new ArrayList<String>(2);
		System.out.println(arr4.size());
		arr4.add("Indigo");
		arr4.add("Cyan");
		System.out.println(arr4.size());
		arr4.trimToSize();
		System.out.println(arr4.size());
		//Note: trimToSize just frees up the unwanted memory allocation, it doesn't change the results of size method.
		//the size always displays the number of elements in the array list
		
	//Write a Java program to increase the size of an array list
		arr4.ensureCapacity(4);
		arr4.add("Grey");
		arr4.add("Pink");
		System.out.println(arr4);
		
	//Write a Java program to print all the elements of a ArrayList using the position of the elements.
		for(int i=0;i<arr4.size();i++) {
			System.out.println(i+" "+arr4.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
