package edu.ch17.collection.arrayList.example;

import java.util.Comparator;

public class Sort {
	
}
class AscendingName implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Customer cu1 = (Customer)o1;
		Customer cu2 = (Customer)o2;
		// String의 compareTo 활용 :: this.charAt(k)-anotherString.charAt(k)
		return cu1.getName().compareTo(cu2.getName());
	}
}

class AscendingAge implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Customer cu1 = (Customer)o1;
		Customer cu2 = (Customer)o2;
		int res = 0;
		if(cu1.getAge() == cu2.getAge()) {
			res = 0;
		}
		if(cu1.getAge() > cu2.getAge()) {
			res = 1; 	// return +; 위치변경
		}
		if(cu1.getAge() < cu2.getAge()) {
			res = -1;	// return -; 그대로
		}
		return res;
	}
}
class AscendingPoint implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Customer cu1 = (Customer)o1;
		Customer cu2 = (Customer)o2;
		int res =0;
		if(cu1.getPoint() == cu2.getPoint()) {
			res =0;
		} else if (cu1.getPoint()<cu2.getPoint()) {
			res = -1;
		} else if(cu1.getPoint()>cu2.getPoint()) {
			res = 1;
		}
		return res;
	}
}

class DescendingName implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Customer cu1 = (Customer)o1;
		Customer cu2 = (Customer)o2;
		return -cu1.getName().compareTo(cu2.getName());
	}
}
class DescendingAge implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Customer cu1 = (Customer)o1;
		Customer cu2 = (Customer)o2;
		int res =0;
		if(cu1.getAge() == cu2.getAge()) {
			res =0;
		} else if(cu1.getAge()<cu2.getAge()) {
			res =1;
		} else if(cu1.getAge()>cu2.getAge()) {
			res = -1;
		}
		return res;
	}
}
class DescendingPoint implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Customer cu1 = (Customer)o1;
		Customer cu2 = (Customer)o2;
		int res = 0;
		if(cu1.getPoint() == cu2.getPoint()) {
			res  =0;
		} else if(cu1.getPoint()<cu2.getPoint()) {
			res = 1;
		} else if(cu1.getPoint()>cu2.getPoint()) {
			res = -1;
		}
		return res;
	}
}
