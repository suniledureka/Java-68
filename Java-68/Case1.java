import java.util.*;

class Node{
 int data;
 Node next;
 Node(int data){
	 this.data = data;
	 this.next = null;
 }
}

class MyLinkedList
{
 Node head;
 public void push(int data){
	 Node newNode = new Node(data);
	 if(head == null){
		head = newNode;
		return;
	 }
	 else{
		 Node last = head;
		 while(last.next != null){
			 last=last.next;
		 }
		 last.next = newNode;
	 }

 }

 public void printList(){
	 Node temp = head;
	 while(temp != null){
		 System.out.println(temp.data+" | ");
		 temp = temp.next;
	 }
 }
}

class Case1
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		MyLinkedList ml = new MyLinkedList();
		System.out.print("Enter how many: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print("enter element-"+i+": ");
			ml.push(sc.nextInt());
		}

		ml.printList();
	}
}

