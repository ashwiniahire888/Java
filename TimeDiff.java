// 15h:22m:15s   11h:8m:10s
class TimeDiff 
{
    public static void main(String[] args) 
	{
          int hh=10,mm=30,ss=15,hh1=15,mm1=10,ss1=5;
		  
       // int hh=15,mm=22,ss=15,hh1=11,mm1=8,ss1=10;
        
        if(ss > ss1)
        {
            mm1--; 
            ss1 +=60;
        }
        int s = ss1 - ss;
         if(mm > mm1)
        {
            hh1--;
            mm1 +=60;
        }
        
        int m = mm1 - mm;
        int h = hh1 - hh; 
        
        System.out.print(h + " hh " + m +" mm " + s +" ss ");
    }       
}
// int hh=10,mm=30,ss=15,hh1=15,mm1=10,ss1=5;
// output :  4 hh 39 mm 50 ss  

// 15h:22m:15s   11h:8m:10s
// output :  -5 hh 45 mm 55 ss