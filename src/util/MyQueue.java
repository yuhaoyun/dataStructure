package util;

public class MyQueue {

	private MyLinkedList elementData;

	public MyQueue() {
		this.elementData = new MyLinkedList();
	}

	// 加入队列
	public void add(Object obj) {

		elementData.add(obj);
	}

	// 获取队首对象
	public Object peek() {

		return elementData.get(0);
	}

	// 获取并删除队首对象
	public Object pool() {

		Object obj = peek();
		elementData.removeFirst();
		return obj;
	}

	public boolean isEmpty() {
		return elementData.size() == 0;
	}

	public int size() {
		return elementData.size();
	}
}
