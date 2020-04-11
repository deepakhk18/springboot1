package collectionslab;

import java.util.Iterator;
import java.util.Vector;

public class question6 {
	public static void mian(String args[])
	{
		Vector<String>v=new Vector<String>();
		v.add("de");
		v.add("arun");
		v.add("div");
		v.add("som");
		v.add("neh");
		Iterator<String>itr=v.iterator();
		System.out.println(itr.next());
	}

}
