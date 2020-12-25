package ua.lviv.lgs.t2;

public class Application {
	@SuppressWarnings("unchecked")
	public static <K, V> void main(String[] args) {
		
		MyEntry<String, Integer> myEntry = new MyEntry<>("Peter", 25);
		MyEntry<Integer, String> myEntry1 = new MyEntry<>(32, "Peter");
		MyEntry<String, String> myEntry2 = new MyEntry<>("Olia", "v25v");
		MyEntry<Integer, Integer> myEntry3 = new MyEntry<>(45, 15);
	
		Integer key = 1;
		
		Mapa<K, V> n = new Mapa<K, V>();
		
		n.setOb1((K)key);
		n.setOb2((V) myEntry);
		n.addMap();
		
		key++;
		
		n.setOb1((K)key);
		n.setOb2((V) myEntry1);
		n.addMap();
		
		key++;
		
		n.setOb1((K)key);
		n.setOb2((V) myEntry2);
		n.addMap();
		
		key++;
		
		n.setOb1((K)key);
		n.setOb2((V) myEntry3);
		n.addMap();
		
		n.printAllMap();
		
		key = 3;
		n.remoteMapByKey((K)key);
		Integer value = 45;
		//String value = "Peter";
		n.remoteMapByValue((V) value);
		n.printAllMap();
		n.printAllKeyMap();
		n.printAllValueMap();
	}
}
