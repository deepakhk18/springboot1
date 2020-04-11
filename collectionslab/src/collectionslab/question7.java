package collectionslab;

import java.util.Iterator;
import java.util.Stack;

public class question7 {
	public static void main(String args[])
	{
		Stack<String>stack=new Stack<String>();
		stack.push("deepak");
		stack.push("divya");
		stack.push("ashok");
		stack.push("ramesh");
		Iterator<String>itr=stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
