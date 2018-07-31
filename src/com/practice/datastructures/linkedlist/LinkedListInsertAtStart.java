package com.practice.datastructures.linkedlist;
/**
 * 
 * @author anurag.garg1
 * @date 2018-06-12
 * @description
 *
 */
public class LinkedListInsertAtStart {

	protected Node start;
	protected Node end;

	public void insertAtStart(int val) {
		Node insert = new Node(val, null);
		if (start == null) {
			start = insert;
			end = start;
		} else {
			insert.setNext(start);
			start = insert;
		}
	}

	public void display() {
		if (size() == 0) {
			System.out.println("Linked list is empty");
		} else if (size() == 1) {
			System.out.println("Data is : " + start.getData());
		} else {
			Node nptr = start;
			while (nptr != null) {
				System.out.println("Data is : " + nptr.getData());
				nptr = nptr.getNext();
			}
		}
	}

	public int size() {
		int count = 0;
		if (start == null) {
			return 0;
		} else if (start == end) {
			return 1;
		} else {
			Node ptr = start;
			while (ptr != null) {
				count++;
				ptr = ptr.getNext();
			}
			return count;
		}
	}

	public static void main(String[] args) {
		LinkedListInsertAtStart linkedlist = new LinkedListInsertAtStart();
		System.out.println("Size of the list is : " + linkedlist.size());
		linkedlist.display();
		linkedlist.insertAtStart(5);
		System.out.println("Size of the list is : " + linkedlist.size());
		linkedlist.display();
		linkedlist.insertAtStart(10);
		System.out.println("Size of the list is : " + linkedlist.size());
		linkedlist.display();

	}

}
