package com.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<BookSale1> al = new ArrayList<BookSale1>();
		al.add(new BookSale1(new Book1(1, "AA", 200f), 5));
		al.add(new BookSale1(new Book1(2, "BB", 300f), 4));
		al.add(new BookSale1(new Book1(3, "CC", 250f), 3));
		al.add(new BookSale1(new Book1(1, "AA", 250f), 1));
		// al.add(new BookSale1(new Book1(2,"EE",250), 4));
		al.add(new BookSale1(new Book1(4, "FF", 250f), 4));
		for (BookSale1 b : al) {
			System.out.println();
		}
		/*
		 * There is also a hashmap which contains information about business
		 * done by each book. Map<int bookid , float amount> Map already has
		 * information about all books and business done till now. You can take
		 * hardcoded values in map.
		 */
		HashMap<Integer, Float> hm = new HashMap<Integer, Float>();
		// ye by defaut value liye hai iska aur uperwale ka koe connection nahi
		// hai
		hm.put(1, 1000f);// newamt=200*5+250*1+oldamt1000=2250
		hm.put(2, 1200f);
		hm.put(3, 750f);

		System.out.println(hm);

		/*
		 * Write a program to update map using new information in given array.
		 * If book is present in map calculate its business amount (price
		 * copiessold) and add to existing amount in map. If book is not present
		 * add its entry in map."
		 */

		Iterator<BookSale1> Boookitr = al.iterator();
		while (Boookitr.hasNext()) {
			BookSale1 p = Boookitr.next();
			int bookid = p.bl.bookid;
			// System.out.println(bookid);
			Float newamt = p.copiesSold * p.bl.price;
			// iterate map
			Set s = hm.entrySet();
			Iterator itr = s.iterator();
			while (itr.hasNext()) {
				Map.Entry e = (Entry) itr.next();
				Integer i = (Integer) e.getKey();
				if (i == bookid) {
					float oldamt = (float) e.getValue();
					newamt = newamt + oldamt;
				}

			}
			hm.put(bookid, newamt);

		}
		for (Map.Entry e : hm.entrySet()) {
			Integer i = (Integer) e.getKey();
			Float f = (Float) e.getValue();
			System.out.println(i + " " + f);
		}

	}
}
