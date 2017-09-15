package util;

public class MyArrayList {

	private Object[] obj;
	private int size;

	public MyArrayList() {
		obj = null;
		size = 0;
	}

	// 末尾添加元素
	public void add(Object data) {
		if (obj == null) {
			obj = new Object[1];
			obj[0] = data;
			size++;
		} else {
			Object[] newObj = new Object[obj.length + 1];
			System.arraycopy(obj, 0, newObj, 0, obj.length);
			newObj[obj.length] = data;
			obj = newObj;
			size++;
		}
	}

	// 指定位置添加元素
	public void add(int index, Object data) {
		if (index > size) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			Object[] newObj = new Object[obj.length + 1];
			// copy index前面部分
			System.arraycopy(obj, 0, newObj, 0, index);
			newObj[index] = data;
			// copy index后面部分
			System.arraycopy(obj, index, newObj, index + 1, obj.length - index);
			obj = newObj;
			size++;
		}
	}

	// 删除指定位置的元素
	public void remove(int index) {
		if (index > size) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			Object[] newObj = new Object[obj.length - 1];
			System.arraycopy(obj, 0, newObj, 0, index);
			System.arraycopy(obj, index + 1, newObj, index, obj.length - index - 1);
			obj = newObj;
			size--;
		}
	}

	// 删除第一次出现的元素
	public boolean remove(Object data) {
		int index = 0;
		boolean flag = false;
		for (int i = 0; i < obj.length; i++) {
			if ((data == null && obj[i] == null) || data.equals(obj[i])) {
				index = i;
				flag = true;
				break;
			}
		}
		if (flag) {
			remove(index);
		}
		return flag;
	}

	// 修改指定位置的元素
	public void set(int index, Object data) {
		if (index > size) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			obj[index] = data;
		}
	}

	// 获得指定位置的元素
	public Object get(int index) {
		if (index > size)
			throw new ArrayIndexOutOfBoundsException();
		return obj[index];
	}

	// 获得长度
	public int size() {
		return size;
	}
}
