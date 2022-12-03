package comparator;

import java.util.Comparator;

import com.demo.beans.Product;

public class MyNameComparator implements Comparator <Product> {
	//this. will come from MyNameComparator
	//and other 2 parameters will be provided by user
	@Override
	public int compare(Product o1, Product o2) {
		System.out.println("int method compare for name");
		System.out.println(o1.getName()+"----------------"+o2.getName());
		if(o1.getName().equals(o2.getName())){
			return o1.getId()-o2.getId();
		}
		else {
			return o1.getName().compareTo(o2.getName());
		}
	}
}
