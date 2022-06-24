package com.revature.deque.demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DeQueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq = new ArrayDeque<String>();
		
		// Operations 1
        // add() method

        // Adding custom elements
        // using add() method to insert
        dq.add("Associates");
        dq.add("Family");
        dq.add("Friends");

        // Iterating using for each loop
        for (String element : dq) {
            // Print the corresponding element
            System.out.println("Element : " + element);
        }

        // Operation 2
        // clear() method
        System.out.println("Using clear() ");

        // Clearing all elements using clear() method
        dq.clear();

        // Operations 3
        // addFirst() method

        // Inserting at the start
        dq.addFirst("Parents");
        dq.addFirst("Children");

        // Operation 4
        // addLast() method
        // Inserting at end
        dq.addLast("Dog");
        dq.addLast("Cat");

        // Display message
        System.out.println(
            "Above elements are removed now");
	
	
	// Display message
    System.out.println("Elements of deque using Iterator :");

    for (Iterator itr = dq.iterator();
        itr.hasNext();) {
        System.out.println(itr.next());
    }

    // descendingIterator()
    // To reverse the deque order
    System.out.println("Elements of deque in reverse order :");

    for (Iterator dItr = dq.descendingIterator(); dItr.hasNext();) {
        System.out.println(dItr.next());
    }
    
    // Operation 5
    // element() method : to get Head element
    System.out.println("\nHead Element using element(): "+ dq.element());

    // Operation 6
    // getFirst() method : to get Head element
    System.out.println("Head Element using getFirst(): "+ dq.getFirst());

    // Operation 7
    // getLast() method : to get last element
    System.out.println("Last Element using getLast(): "+ dq.getLast());

    // Operation 8
    // toArray() method :
    Object[] arr = dq.toArray();
    System.out.println("\nArray Size : " + arr.length);

    System.out.print("Array elements : ");

    for (int i = 0; i < arr.length; i++)
        System.out.print(" " + arr[i]);

    // Operation 9
    // peek() method : to get head
    System.out.println("\nHead element : "+ dq.peek());

    // Operation 10
    // poll() method : to get head
    System.out.println("Head element poll : "+ dq.poll());
    //Operation 11
    // push() method
    dq.push("Food");
    dq.push("Water");
    dq.push("Juice");

    // Operation 12
    // remove() method : to get head
    System.out.println("Head element remove : "+ dq.remove());

    System.out.println("The final array is: " + dq);
}
}



