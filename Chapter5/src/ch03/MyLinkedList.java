package ch03;

public class MyLinkedList {
	
	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		head=null;
		count=0;
		
	}
	
	public MyListNode addElement(String data) {
		
		MyListNode newNode;
		if(head==null) { // 만약 첫노드라면
			newNode=new MyListNode(data); 
			head=newNode;			
		}
		else {
			newNode=new MyListNode(data);
			// should find last node to add new node
			MyListNode temp=head;
			
			while(temp.next !=null){
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
		count++;
		return newNode;
		
	}
	
	public MyListNode insertElement(int position,String data) {
		// 중간에 넣기 위해서는 prev 노드를 찾아야 한다. 
		
		int i; 
		MyListNode tempNode=head;
		MyListNode preNode=null;
		
		MyListNode newNode = new MyListNode(data);
		
		if(position <0 || position > count) {
			return null;
		}
		
		if(position == 0) {
			newNode.next=head;
			head=newNode;
		}
		
		else {
			// position 바로 앞까지 prev 찾는다.
			for(i=0;i<position;i++) {
				preNode=tempNode;
				tempNode=tempNode.next;
			}
			newNode.next=preNode.next;
			preNode.next=newNode;
			
		}
		count++;
		return newNode;		
		
	}
	
	public MyListNode removeElemnt(int position) {
		
		int i;
		MyListNode tempNode=head;
		MyListNode preNode=null;
		
		if(position <0 || position > count) {
			System.out.println("The position is out of range.Current list count is "+count);
			return null;			
		}
		
		if(position == 0) { // if remove first node, jsut allocate tempNode to head Node
			
			head=tempNode.next;
		}
		else {
			for(i=0;i<position;i++) {
				preNode=tempNode; // This is preve node of position aftr for loop
				tempNode=tempNode.next; // This is position node after for loop
			}
			
			// 지워지는 것은 temp
			preNode=tempNode.next;				
		}
		count--;
		System.out.println(position+"th Node was deleted");
		return tempNode;		
		
	}
	
	public String getElement(int position) {
		// To get element, you should search position from head 
		int i;
		MyListNode tempNode=head;
		
		// input validation check
		if(position==0 || position >=count) {
			System.out.println("The Position is out of range. Current list count is "+count);
			return new String("err");		
		}
		
		if(position==0) {
			return head.getData();
		}
		
		for(i=0;i<position;i++) {
			tempNode=tempNode.next;
		}
		return tempNode.getData();	
		
	}
	
	public MyListNode getNode(int position) {
		
		int i;
		MyListNode tempNode=head;
		
		if(position==0 || position >=count) {
			System.out.println("The Position is out of range. Current list count is "+count);
			return null;		
		}
		
		if(position ==0) {
			return head;
		}
		
		for(i=0;i<position;i++) {		
			tempNode=tempNode.next;			
		}
		
		return tempNode;	
		
	}
	
	public void removeAll() {
		//  링크의 첫 포인터인 head만 삭제하면 된다.
		
		head=null;
		count=0;
	}
	
	public void printAll() {
		if(count==0) {
			System.out.println("The list is empty now");
		}
		
		MyListNode tempNode=head;
		
		while(tempNode!=null) {
			System.out.print(tempNode.getData());
			tempNode=tempNode.next;	
			if(tempNode!=null) System.out.print("--->");
		}
		System.out.println("");
	}
	

	public int getSize()
	{
		return count;
	}
	


	

}
