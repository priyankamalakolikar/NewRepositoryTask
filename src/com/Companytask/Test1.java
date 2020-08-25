package com.Companytask;

public class Test1 {
/*If the seventh day of a month is three days earlier than Friday,
 *what day will it be on the twentieth day of the month ?*/
	
public static void main(String[] args) {
	String[] Day={"Sun","Mon","Tus","Wed","Thur","Fri","Sat"};
	String seventhday = null;
	int z;
	for(int i=0;i<Day.length;i++)
	{
		if(Day[i].equals("Fri"))
		{
			//three day earliar
	     z=i-3;
        seventhday=Day[z];
		}
	}
	String[] newday={"Wed","Thur","Fri","Sat","Sun","Mon",seventhday};
	int strat=7;
	//19 took bexz array start from zero index
	 int x=19;
		for (;;) {
			strat = strat + 7;
			if (strat == 14) {
				//19 took bexz array start from zero index
				x = x - 14;
				break;
			}

		}
		System.out.println(newday[x]);
	
}
}
