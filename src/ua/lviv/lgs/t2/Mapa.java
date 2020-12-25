package ua.lviv.lgs.t2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa<K, V> {
	
	K ob1;
	V ob2;	
	public Map<K, V> map = new HashMap<>();
			
	public Mapa() {
		super();
	}

	public Mapa(K ob1, V ob2) {
		super();
		this.ob1 = ob1;
		this.ob2 = ob2;		
	}	

	public void setOb1(K ob1) {
		this.ob1 = ob1;
	}

	public void setOb2(V ob2) {
		this.ob2 = ob2;
	}
	
	@Override
	public String toString() {
		return "[ map=" + map + "]";
	}
	

		public void addMap() {
			map.put(ob1, ob2);			
		}
		
		public void remoteMapByKey(K ob1) {
			Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
			while(iterator.hasNext()) {
				Entry<K, V> next = iterator.next();
				if((Integer) next.getKey() == (Integer) ob1 ) {
					iterator.remove();
				}
			}			
		}
		
		@SuppressWarnings("unlikely-arg-type")
		public void remoteMapByValue(V ob2) {
			Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
			while(iterator.hasNext()) {
				Entry<K, V> next = iterator.next();
				
				@SuppressWarnings("unchecked")
				MyEntry<K, V> element = (MyEntry<K, V>) next.getValue();
					if(ob2.equals(element.getOb1()) || ob2.equals(element.getOb2())) {
						iterator.remove();
					}
			}			
		}
		
		public void printAllKeyMap() {
				System.out.println();
			Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
			while(iterator.hasNext()) {
				Entry<K, V> next = iterator.next();
					System.out.println(next.getKey());
			}			
		}
		
		public void printAllValueMap() {
				System.out.println();
			Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
			while(iterator.hasNext()) {
				Entry<K, V> next = iterator.next();
					System.out.println(next.getValue());
			}			
		}
		
		public void printAllMap() {
				System.out.println();
			Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
			while(iterator.hasNext()) {
				Entry<K, V> next = iterator.next();
					System.out.println(next);
			}			
		}
	
}
