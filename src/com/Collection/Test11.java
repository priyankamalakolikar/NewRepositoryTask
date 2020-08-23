package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Test11 {
	public static void main(String[] args) {
		ArrayList<Order11> al = new ArrayList<Order11>();
		al.add(new Order11(1, "Pav-Bhaji", 40, 2));
		al.add(new Order11(2, "Hakka Noodles", 60, 2));
		al.add(new Order11(3, "Grilled Sandwitc", 25, 2));
		al.add(new Order11(4, "Pizza", 250, 2));
		al.add(new Order11(5, "Allu-Tikki", 40, 2));
		al.add(new Order11(6, "Pav-Bhaji", 40, 1));
		al.add(new Order11(2, "Hakka Noodles", 60, 1));

		System.out.println(al);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		int totalprice = 0;
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				// System.out.println(al.get(i).MenuName+"
				// "+al.get(j).MenuName);

				if (al.get(i).MenuName.compareTo(al.get(j).MenuName) == 0) {
					totalprice = (al.get(i).price * al.get(i).qtyOrdered) + (al.get(j).price * al.get(j).qtyOrdered);
					hm.put(al.get(i).MenuName, totalprice);

				} else {
					totalprice = (al.get(i).price * al.get(i).qtyOrdered);
					hm.put(al.get(i).MenuName, totalprice);

				}
			}

		}
		System.out.println(hm);
	}
}
