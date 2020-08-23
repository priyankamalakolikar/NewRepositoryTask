package com.Collection;
/*"Create a collection to maintain data in sorted order of Movie Rating and 
 * if 2 movies have
same rating then according to Theatrename (use Anonymous class for sorting) 
Theatre (Theatreid,Theatrename,location,Movie)
Movie (Movieid,Moviename,Rating)"
*/
public class Movie7 {
   int Movieid;
  String	Moviename;
   int Rating;

public Movie7(int movieid, String moviename, int rating) {
	super();
	Movieid = movieid;
	Moviename = moviename;
	Rating = rating;
}
@Override
public String toString() {
	return "Movie7 [Movieid=" + Movieid + ", Moviename=" + Moviename + ", Rating=" + Rating + "]";
}
}
