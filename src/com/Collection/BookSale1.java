package com.Collection;

public class BookSale1 {
Book1 bl;
int copiesSold ;
public BookSale1(Book1 bl, int copiesSold) {
	super();
	this.bl = bl;
	this.copiesSold = copiesSold;
}
@Override
public String toString() {
	return "BookSale1 [bl=" + bl + ", copiesSold=" + copiesSold + "]";
}


}
