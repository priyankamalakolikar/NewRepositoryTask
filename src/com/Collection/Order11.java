package com.Collection;

public class Order11 {
/* "Hotel serves delicious Menus to its Customers. It maintains list of Orders
given on daily basis. Order list is maintained as ArrayList<Order>.
Each Order contains orderid, MenuName, price,  qtyOrdered. 
(Price of same Menu may vary according hours).
From ArrayLsit of Orders create a map <String,Float> where
Menu Name is key and total sale in a day for theMenu as Value.
 (sale for the menu is Price*qty ordered).Eg. Order List for a day is :

[(80,”Pav Bhajee”,120.00,5), (90,”Grilled Sandwitch”,72.00,10),   (92,”Hakka Noodles”,220.00,2), (96,”Pav Bhajee”,125.00,8),        (101,”Grilled Sandwitch”,70.00,2)]

Then Map would be like this :
{{“Pav Bhajee”,(120*5)+(125*8) ie.1600},   {“Hakka Noodles”, 440}, {“Grilled Sandwitch”,860}}
"
*/
	int orderid;
	String MenuName;
	int price;
	int qtyOrdered;
	public Order11(int orderid, String menuName, int price, int qtyOrdered) {
		super();
		this.orderid = orderid;
		MenuName = menuName;
		this.price = price;
		this.qtyOrdered = qtyOrdered;
	}
	@Override
	public String toString() {
		return "Order11 [orderid=" + orderid + ", MenuName=" + MenuName + ", price=" + price + ", qtyOrdered="
				+ qtyOrdered + "]";
	}
	/*@Override
	public int compareTo(Order11  o) {
		// TODO Auto-generated method stub
		int i=this.MenuName.compareTo(o.MenuName);
		if(i==0)
		{
			int t=this.price*o.qtyOrdered;
		return t;
		
		}
		return 1;
	}
	*/
	
}
