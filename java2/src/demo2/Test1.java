package demo2;

import java.util.ArrayList;
import java.util.Iterator;
public class Test1 {
	public static void main(String[] args) {
ArrayList<String> al = new ArrayList<String>();
		al.add("Ram");
		al.add("sam");
		al.add("anu");
		al.add("priya");
		al.add("kavin");
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());}
ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(7);
	a.add(2);
	a.add(4);
	a.add(8);
	a.add(5);
	Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());}
	al.set(4,"Hema");
	{
	System.out.println(al);
	}
	a.get(3);
	 {
	System.out.println("i want to see 3rd employeeid:" +a.get(3));
	 }
ArrayList<Object> ab = new ArrayList<Object>();
    ab.addAll(al);
    ab.addAll(a);
    {
  	System.out.println(ab);
    }
    ab.removeAll(a);
  {
  	System.out.println(ab);
  }
    ab.add(5,1);
    ab.add(6,2);
    ab.add(7,3);
    ab.add(8,4);
    ab.add(9,5);
   System.out.println(ab); 
}
}
