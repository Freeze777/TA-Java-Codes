package snippets;

class Node<T> {
	private T data; // better than the Object version..!!
	Node next;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

}

class LList<T> {
	private Node<T> head;

	public void print() {
		Node<T> crawl = head;
		while (crawl != null) {
			System.out.print(crawl.getData() + "->");
			crawl = crawl.next;
		}
		System.out.print("null\n");
	}

	public void insert(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
		} else {
			Node<T> crawl = head;
			while (crawl.next != null) {
				crawl = crawl.next;
			}
			crawl.next = node;
		}
	}

}

public class Generics {
	//why generics???
	// avoid dynamic type casting..!! detect errors at compile time.
	// code reuse-- one implementation for every type of class
	public static void main(String[] args) {
		LList<Integer> ilist = new LList<Integer>();
		ilist.insert(10);
		ilist.insert(20);
		ilist.insert(190);
		//list.insert("190"); compile time error!!
		ilist.print();
		
		LList<String> slist = new LList<String>();
		slist.insert("abc");
		slist.insert("xyz");
		slist.insert("mno");
		slist.print();
	}

}