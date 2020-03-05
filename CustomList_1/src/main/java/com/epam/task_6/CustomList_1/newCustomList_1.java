package com.epam.task_6.CustomList_1;

public class newCustomList_1 extends customList_1 {
	public static void main(String args[]) {
		customList_1 cl=new customList_1();
		cl.adding("one");
		cl.adding("two");
		cl.adding("three");
		cl.adding("four");
		cl.adding("five");
		cl.adding("six");
		cl.adding("seven");
		cl.adding("eight");
		cl.adding("nine");
		cl.adding("ten");
		//displaying elements in the list
		System.out.println("elements in the list");
		System.out.println("---------------------------");
		cl.display();
		System.out.println();
		//adding an element 
		System.out.println("adding the element-->harsha");
		System.out.println("---------------------------");
		cl.adding("harsha");
		System.out.println();
		//deleting an element
		System.out.println("deleting the element-->five");
		System.out.println("---------------------------");
		cl.delete("five");
		System.out.println();
		//displaying elements in the list
		System.out.println("elements in the list");
		System.out.println("---------------------------");
		cl.display();
		//get element using the index
		System.out.println("getting element at position 5");
		System.out.println("---------------------------");
		cl.getelement(5);
		System.out.println();
		//size of the list
		cl.sizeOfList();		
}
}