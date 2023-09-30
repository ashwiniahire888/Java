/*Write a program to accept a string as command line argument and check whether it is a
file or directory. Also perform operations as follows:
a.  If it is a directory, list the names of text files. Also, display a count showing
the number of files in the directory.
b. If it is a file display various details of that file.*/
import java.io.*;
class FileDemo
{
	public static void main(String args[]) throws IOException,FileNotFoundException
	{
		File F=new File(args[0]);
		int count=0,cnt=0;
		String str;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		if(F.isDirectory())
		{
			String[] flist=F.list();
			for(String fname:flist)
			{   
				System.out.println(fname);
				count++;
				File F2=new File(fname);
				System.out.println("Files end with .txt");
				if(fname.endsWith(".txt"))
				{
					System.out.println(fname);
					cnt++;
				}
				System.out.println("Total files in directory"+count);
				System.out.println("Total text file"+cnt);
			}
		}
		if(F.isFile())
		{
			System.out.println("Information about the file");
			System.out.println("File Path"+F.getPath());
			System.out.println("File Size"+F.length());
			System.out.println("Last Modified"+F.lastModified());
			System.out.println("File Path"+F.getParent());
		}
	}			
}