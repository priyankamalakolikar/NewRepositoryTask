package com.Collection;
/*
 * "There is arraylist which contains objects of class 
 * BookSale{ Book b , int copiesSold }
Book { int bookid , String author , float price } 
There is also a hashmap which contains information about business done by each book.
Map<int bookid , float amount> Map already has information about all books and business
done till now. You can take hardcoded values in map. 
Write a program to update map using
new information in given array. If book is present in map calculate its business amount 
(price copiessold) and add to existing amount in map. 
If book is not present add its entry in map."
*/
public class Book1 {
int bookid;
String author;
float price;
public Book1(int bookid, String author, float price) {
	super();
	this.bookid = bookid;
	this.author = author;
	this.price = price;
}
@Override
public String toString() {
	return "Book1 [bookid=" + bookid + ", author=" + author + ", price=" + price + "]";
}

}
