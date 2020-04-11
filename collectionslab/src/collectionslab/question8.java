package collectionslab;

import java.util.Iterator;
import java.util.TreeSet;

public class question8 {
	   public static void man(String args[])
	   {
		   TreeSet<String>set=new TreeSet<String>();
		   set.add("ravi");
		   set.add("deepak");
		   set.add("div");
		   set.add("er");
		   set.add("tre");
		   Iterator<String>itr=set.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
	   }

}
