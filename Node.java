public class Node<T>
	{
		Node<T> previous;
		Node<T> next;
		private T data;
		//constructor
		void Node()
		{
			previous = null;
			next = null;
			data = null;
		}
		void setData(T t)
		{
			data = t;
		}
		
		T getData()
		{
			return data;
		}
		
		
	}