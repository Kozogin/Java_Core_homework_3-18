package finalyTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList2<E> implements List<E> {

	private E[] array;
	private int arraySize;
	private int allMemory;

	public MyList2() {
		this(10);
	}

	@SuppressWarnings("unchecked")
	public MyList2(int i) {
		this.array = (E[]) new Object[i];
		this.arraySize = 0;
		this.allMemory = 10;
	}
	
	public MyList2(E [] ar, int arraySize, int allMemory) {
		
		array = ar;
		this.arraySize = arraySize;
		this.allMemory = allMemory;
	}

	@SuppressWarnings("unchecked")
	private boolean reduceArray(int index) {

		arraySize--;
		int removeCorrect = 0;
		Object[] tempArray = new Object[arraySize];
		for (int i = 0; i < arraySize; i++) {
			if (i >= index) {
				removeCorrect = 1;
			}
			tempArray[i] = array[i + removeCorrect];
		}
		if ((double) (allMemory) / arraySize > 1.5) {
			allMemory /= 1.5;
			allMemory++;
		}

		array = (E[]) new Object[allMemory];
		for (int i = 0; i < arraySize; i++) {
			array[i] = (E) tempArray[i];
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	private boolean increaseArray() {

		E[] tempArray = (E[]) new Object[arraySize];
		tempArray = array;
		allMemory *= 1.5;
		array = (E[]) new Object[allMemory];

		for (int i = 0; i < tempArray.length; i++) {
			array[i] = (E) tempArray[i];
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public boolean add(Object e) {

		if (arraySize >= allMemory) {
			increaseArray();
		}
		array[arraySize] = (E) e;
		arraySize++;
		return false;
	}

	public boolean remove(Object o) {
		int indexRemove = -1;
		if (contains(o)) {
			for (int i = 0; i < arraySize; i++) {
				if (array[i].equals(o)) {
					indexRemove = i;
					break;
				}
			}
			reduceArray(indexRemove);
		}
		return false;
	}

	public int size() {
		return arraySize;
	}

	public boolean isEmpty() {
		return arraySize == 0 ? true : false;
	}

	public boolean contains(Object o) {

		for (int i = 0; i < arraySize; i++) {
			if (array[i].equals(o)) {
				return true;
			}
		}
		return false;
	}

	public E get(int index) {
		return array[index];
	}

	public Object[] toArray() {
		return array;
	}

	@SuppressWarnings("unchecked")
	public void clear() {

		this.arraySize = 0;
		this.allMemory = 10;
		this.array = (E[]) new Object[allMemory];

	}

	public E remove(int index) {
		reduceArray(index);
		return null;
	}
	
	public boolean addAll(Collection<? extends E> c) {
		for (E e : c) {
			if(e != null) {
				add(e);
			}
		}
		return false;
	}
		
	public void add(int index, E element) {

		if (index <= arraySize) {
			arraySize++;
			if (arraySize >= allMemory) {
				increaseArray();
			}
			for (int i = arraySize + 1; i > 0; i--) {
				if (i > index) {
					array[i] = array[i - 1];
				}
			}
			array[index] = element;
		}
	}
	
	@SuppressWarnings("unchecked")
	public boolean addAll(int index, Collection<? extends E> c) {		
		
		E[] tempArray = (E[]) new Object[arraySize];
		for (int i = 0; i < arraySize - index; i++) {
			tempArray[i] = array[index + i];
		}
		
		arraySize = index;		
			addAll(c);		
		
		for (int i = 0; i < tempArray.length; i++) {
			if(tempArray[i] != null) {
				add(tempArray[i]);
			}
		}
		
		return false;
	}
	
	public List<E> subList(int fromIndex, int toIndex) {
		
		@SuppressWarnings("unchecked")
		E[] tempArray = (E[]) new Object[(int) ((toIndex - fromIndex) * 1.3)];
		int j = 0;
		for (int i = fromIndex; i < toIndex; i++) {
			tempArray[j] = array[i];
			j++;
		}		
		return new MyList2<E>(tempArray, (toIndex - fromIndex), (int) ((toIndex - fromIndex) * 1.3));
	}
	
	public int indexOf(Object o) {
		int index = -1;
		if (contains(o)) {
			for (int i = 0; i < arraySize; i++) {
				if (array[i].equals(o)) {
					index = i;
					break;
				}
			}			
		}
		return index;
	}
	
	public int lastIndexOf(Object o) {
		int index = -1;
		if (contains(o)) {
			for (int i = arraySize-1; i > 0; i--) {
				if (array[i].equals(o)) {
					index = i;
					break;
				}
			}			
		}
		return index;
	}
	
	public E set(int index, E element) {
		if(index <= arraySize) {
			array[index] = element;
		}
		return null;
	}
	
	

	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + "]";
	}
	
	
	
	

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}		

	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
