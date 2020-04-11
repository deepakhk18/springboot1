package collectionslab;

import java.util.Iterator;
import java.util.LinkedList;

public class question5 {
	public static void main(String args[])
	{
		LinkedList<String>al=new LinkedList<String>();
		al.add("frr");
		al.add("dee");
		al.add("ff");
		al.add("trr");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
