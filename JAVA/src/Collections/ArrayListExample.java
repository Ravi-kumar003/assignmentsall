package Collections;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample {

	public static void main(String[] args) {
ArrayList<String> fruits=new ArrayList<String>();
fruits.add("banana");
fruits.add("apple");
fruits.add("grapes");
fruits.add("guava");
fruits.add("mango");
System.out.println("the types of fruits are:"+fruits);
fruits.add("pinapple");
System.out.println("after updating");
System.out.println("the types of fruits are:"+fruits);
fruits.remove(2);
System.out.println("after removing 2nd index position");

System.out.println("the types of fruits are:"+fruits);
System.out.println("the types of fruits are:"+fruits.get(3));

fruits.add(2,"pappaya");
System.out.println("the types of fruits are:"+fruits);
System.out.println("after sorting");
Collections.sort(fruits);
System.out.println("the types of fruits are:"+fruits);

//for(String games:fruits)
	//System.out.println(games);
}
}