package Problem2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductInfo {
	static enum SortMethod {
		BYTITLE, BYPRICE
	}

//
//	private SortMethod sortMethod ;
//
//	public ProductInfo(SortMethod sortMethod) {
//		this.sortMethod = sortMethod;
//	}

	public void sort(List<Product> list, final SortMethod sortMethod) {

		Collections.sort(list, (o1, o2) -> {

//			if (sortMethod == SortMethod.BYPRICE)
//				return (int) (o1.getPrice() - o2.getPrice());
//			else
//				return o1.getTitle().compareTo(o2.getTitle());
			
			if(o1.getTitle().compareTo(o2.getTitle())!=0){
				return o1.getTitle().compareTo(o2.getTitle());
			}
			else
				return o1.getModel()-o2.getModel();
			
		});
	}

}
