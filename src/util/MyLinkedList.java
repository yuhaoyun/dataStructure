package util;

public class MyLinkedList {

	private static class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	private Node head;
	private int size;

	public MyLinkedList() {
		head = null;
		size = 0;
	}

	// 末尾添加元素
	public void add(Object data) {
		if (head == null) {
			head = new Node(data);
			size++;
		} else {
			Node node = new Node(data);
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			size++;
		}
	}

	// 指定位置添加元素
	public void add(int index, Object data) {
		if (index == 0) {
			addFirst(data);
		} else {
			Node node = new Node(data);
			getNode(index - 1).next = node;
			node.next = getNode(index);
			size++;
		}
	}

	// 添加元素到第一个节点
	public void addFirst(Object data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
		size++;
	}

	// 删除第一个节点的元素
	public void removeFirst() {
		Node node = head.next;
		head = node;
		size--;
	}

	// 删除指定位置的元素
	public void remove(int index) {
		if (index == 0) {
			removeFirst();
		} else {
			getNode(index - 1).next = getNode(index + 1);
			size--;
		}
	}

	// 删除第一次出现的元素
	public boolean remove(Object data) {
		boolean flag = false;
		int i = 0;
		Node temp = head;
		while (temp.next != null) {
			if ((data == null && temp == null) || data.equals(temp)) {
				flag = true;
				break;
			}
			temp = temp.next;
			i++;
		}
		if (flag) {
			remove(i);
		}
		return flag;
	}

	// 修改指定位置的元素
	public void set(int index, Object data) {
		getNode(index).data = data;
	}

	// 获得指定位置的元素
	public Object get(int index) {
		return getNode(index).data;
	}

	// 获得指定位置的节点
	public Node getNode(int index) {
		if (index > size) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			int i = 0;
			Node temp = head;
			while (i < index) {
				temp = temp.next;
				i++;
			}
			return temp;
		}
	}

	// 反转链表
	public void reverse() {

	}

	// 获得长度
	public int size() {
		return size;
	}
}
