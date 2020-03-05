package com.epam.task_6.CustomList_1;
import java.util.LinkedList;
public class customList_1 {
	 LinkedList<String> LL = new LinkedList<String>();
	 //adding an element
	 void adding(String data)
	 {
		 LL.add(data);
		 System.out.println("Element added successfully");
		 System.out.println();
	 }
	 //printing elements in list
	 void display()
	 {
		 for(String obj:LL)
			 System.out.println(obj);
		 System.out.println();
	 }
	 //deleting an element
	 void delete(String data)
	 {
		 if(LL.contains(data)) 
		 {
			 LL.remove(data);
			 System.out.println("Element deleted successfully");
		 }
		 else
			 System.out.println("element not found");
	 }
	 //get element from list
	 void getelement(int index)
	 {
		 System.out.println(LL.get(index-1));
	 }
	 void sizeOfList()
	 {
		 int size=LL.size();
		 System.out.println("size of list is:"+size);
	 }
}