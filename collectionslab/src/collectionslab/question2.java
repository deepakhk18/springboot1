package collectionslab;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class question2 {

	public static void main(String args[])
	{
		String s1="bike";
		String s2="car";
		Set s11=new HashSet();
		s11.add(s1);
		s11.add(s2);
		System.out.println("the contents of hashset are "+"........>"+s11);
		Set<String>s111=new TreeSet<String>();
		s111.add(s1);
		s111.add(s2);
		System.out.println("the contents of treeset are "+"......>"+s111);
		
		s111.add("rama");
		s111.add("bhema");
		s111.add("jama");
		s111.add("shama");
		for(String s:s111)
		{
			if(s.contains("rama"))
			{
				System.out.println("the values are "+".....>"+s111);
			}
		}
	}
}
