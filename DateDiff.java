class DateDiff
{
	public static void main(String args[])
	{		
			int day1=05, mon1=8, year1=2001,
			    day2=20, mon2=8, year2=2001;
				  
			int day_diff, mon_diff, year_diff;    

            System.out.println(" Data first is = " + day1 + " / " + mon1 + " / " + year1);
			System.out.println(" Data Second is = " + day2 + " / " + mon2 + " / " + year2);
				
			if(day2 < day1)
			{     	
				if (mon2 == 3)
				{   //  check whether year is a leap year
					if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0)) 
					{
						day2 += 29;
					}
					else
					{
						day2 += 28;
					}                        
				} // borrow days from April or June or September or November
				else if (mon2 == 5 || mon2 == 7 || mon2 == 10 || mon2 == 12) 
				{
				   day2 += 30; 
				}// borrow days from Jan or Mar or May or July or Aug or Oct or Dec
				else
				{
				   day2 += 31;
				}
				mon2 = mon2 - 1;
			}
			if (mon2 < mon1)
			{
				mon2 += 12;
				year2 -= 1;
			}

			day_diff = day2 - day1;
			mon_diff = mon2 - mon1;
			year_diff = year2 - year1;

			System.out.println(" Data Diffrance is = " + day_diff + " / " + mon_diff + " / " + year_diff);
		}
}