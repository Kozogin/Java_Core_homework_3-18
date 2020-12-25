package finalyTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws CloneNotSupportedException{
    	
    	Person p = new Person("Vasily", 24);
    	System.out.println(p);
    	
//    	Person p2 = (Person) p.clone();
//    	System.out.println(p2);
    	
    	int [] [] a = {{1, 2, 44}, {5, 8, 47}};
    	 
        System.out.println(Arrays.deepToString(a));
        
        Random rnd = new Random();
        System.out.println(rnd.nextInt(10) +1);
        System.out.println(rnd.nextInt(10) +1);
        System.out.println(rnd.nextInt(10) +1);
        
        System.out.println();
        
        List<String> all = new ArrayList<String>();
        all.add("25");
        all.add("(short)25");
        all.add("252530L");
        all.add("25.65");
        all.add("8525.645f");
        all.add("true");
        all.add("string");
        
        for (Object object : all) {
			System.out.println(object);
		}
        
        List<String> myList = new MyList2<String>();
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        myList.add("first");
        myList.add("second");
        myList.add("first");
        myList.add("second");
        myList.add("first");
        myList.add("second");
        myList.add("first");
        myList.add("second");
        myList.add("c#");
        myList.add("c++");
        
        myList.add("java");
        myList.add("comet");
        
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        
        myList.add("vasa");
        myList.add("oxana");
        myList.add("roman");
        
        myList.add("ruslan");
        myList.add("star");
        myList.add("25");
        myList.add("32");
        
        System.out.println(myList);
        System.out.println(myList.size());
        
//        System.out.println(myList);
//        System.out.println(myList.size());
//        System.out.println(myList.contains("java"));
//        System.out.println(myList.contains("javaScript"));
//        System.out.println("cont " + myList.contains(25));
//        System.out.println(myList.contains(28));
        
//        myList.remove("c++");
//        myList.remove("star");
//        myList.remove("ruslan");
//        
//        myList.remove("c#");
        myList.remove("java");
        myList.remove("first");
//        
        System.out.println(myList);
        System.out.println(myList.size());
        
        System.out.println(myList.get(2));        
        
        Object[] array = myList.toArray();
        
        System.out.println(Arrays.toString(array));
        
        myList.remove(0);
        myList.remove(6);
        
//        myList.clear();
        System.out.println(myList);
        System.out.println(myList.size());
        myList.addAll(all);
        
        System.out.println(myList);
        System.out.println(myList.size());
        
        List<String> subList = myList.subList(7,  12);
        System.out.println(subList);
        System.out.println(subList.size());
        
        System.out.println(myList);
        System.out.println(myList.size());
        
        System.out.println(myList.indexOf("string"));
        
        myList.set(3, "four");
        System.out.println(myList);
        System.out.println(myList.size());
        
        myList.add(21, "333");
        System.out.println(myList);
        System.out.println(myList.size());
        
        myList.addAll(3, all);
        System.out.println(myList);
        System.out.println(myList.size());

    }
    
    
}
