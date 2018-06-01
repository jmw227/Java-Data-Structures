//Linked List 

public class myLinkedList<T> 
{
	//pointer to the start of the list
	Node<T> start;
	//number of total entries into the lsit
	int numOfEntries;
	
	
	//empty constructor
	void myLinkedList()
	{
		start = null;
		numOfEntries =0;
	}
	//base constructor
	void myLinkedList(Node<T> newStart)
	{
		start = newStart;
		numOfEntries=1;
		
	}
	
	//add a new node to the end of the list
	void addNode(Node<T> newNode)
	{
		Node<T> currentNode = start;
		if(currentNode == null)
		{
			start = newNode;
			numOfEntries=1;
		} else
		{
			while(currentNode.next !=null)
			{
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			numOfEntries++;
		}
	}
	
	// traverses the total list
	void traverseList()
	{
		Node<T> currentNode = start;
		while(currentNode !=null)
		{
			System.out.println(currentNode.getData());
			currentNode=currentNode.next;
		}
	}
	
	//returns total number of entries into the list
	int getNumberOfEntries()
	{
		return numOfEntries;
	}
	
	

	
		public static void main(String[] args)
	{
		try{
			myLinkedList<Integer> myLL = new myLinkedList<>();
			Integer n =0;
			Node<Integer> node = new Node<Integer>();
			node.setData(n);
			n=1;
			Node<Integer> node2 = new Node<Integer>();
			node2.setData(n);
			myLL.addNode(node);
			myLL.addNode(node2);
			myLL.traverseList();
			System.out.println(myLL.getNumberOfEntries());
			
		}catch(Exception e){
			e.printStackTrace(System.out);
			System.out.println("ERROR");
			}
	}			
}