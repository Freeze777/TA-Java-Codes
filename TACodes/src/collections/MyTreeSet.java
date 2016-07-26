package collections;

public class MyTreeSet<K extends Comparable> 
{
	private class Node<K>
	{
		K key;
		Node<K> left, right;
		
		Node(K key)
		{
			this.key = key;
		}

				
	}
	
	Node<K> root = null;
	
	public void insert(K key)
	{
		if(root == null)
			root = new Node<K>(key);
		Node<K> ptr = root;
		Node<K> temp = null;
		
		while(ptr != null){
			temp = ptr;
			if(key.compareTo(ptr.key) == 0)
				return;
			else if(key.compareTo(ptr.key) > 0)
				ptr = ptr.left;
			
				
		}
	}
}
