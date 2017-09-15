package util;

public class MyStack {

	private MyArrayList elementData;

	public MyStack() {
		this.elementData = new MyArrayList();
	}

	// 压栈
	public void push(Object obj) {
		elementData.add(obj);
	}

	// 移除栈顶对象并返回该对象
	public Object pop() {

		Object obj = peek();
		elementData.remove(size() - 1);
		return obj;
	}

	// 获得栈顶对象
	public Object peek() {

		return elementData.get(size() - 1);
	}

	// 返回对象在栈中位置 从1开始
	public int search(Object obj) {

		for (int i = 0; i < elementData.size(); i++) {
			if ((obj == null && elementData.get(i) == null) || obj.equals(elementData.get(i))) {
				return i + 1;
			}
		}
		return -1;
	}

	public boolean isEmpty() {

		return elementData.size() == 0;
	}

	public int size() {

		return elementData.size();
	}

}
