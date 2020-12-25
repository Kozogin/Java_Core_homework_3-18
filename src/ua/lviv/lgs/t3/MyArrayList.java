package finalyTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {

	private Object[] array;
	private int arraySize;
	private int allMemory;

	public MyArrayList() {
		this(10);
	}

	public MyArrayList(int i) {
		this.array = new Object[i];
		this.arraySize = 0;
		this.allMemory = 10;
	}
	
	private boolean reduceArray(int index) {
		
		arraySize--;
		int removeCorrect = 0;
		Object [] tempArray = new Object[arraySize];
		for (int i = 0; i < arraySize ; i++) {
			if(i >= index) {
				removeCorrect = 1;
			}
			tempArray[i] = array[i + removeCorrect];
		}
		if((double)(allMemory)/arraySize > 1.5) {			
			allMemory /= 1.5;
			allMemory++;
		}		
		
		array = new Object[allMemory];
		for (int i = 0; i < arraySize; i++) {
			array[i] = tempArray[i];
		}
						
		return false;		
	}
	
	private boolean increaseArray() {		
		
		Object [] tempArray = new Object[allMemory];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		allMemory *= 1.5;
		array = new Object[allMemory];
		
		for (int i = 0; i < tempArray.length; i++) {
			array[i] = tempArray[i];
		}
		return false;		
	}

	public boolean add(Object e) {
		
		if(arraySize >= allMemory) {
			increaseArray();			
		} 
			array[arraySize] = e;
			arraySize++;
		return false;
	}
	
	public boolean remove(Object o) {
		int indexRemove = -1;		
		if(contains(o)) {
			for (int i = 0; i < arraySize; i++) {
				if(array[i].equals(o)) {
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
		return arraySize == 0 ? true: false;
	}

	public boolean contains(Object o) {
		
		for (int i = 0; i < arraySize; i++) {
			if(array[i].equals(o)) {				
				return true;
			}			
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + "]";
	}
	
	
	
	
	
	
	
	

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
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

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int index, Collection<? extends E> c) {
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

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
