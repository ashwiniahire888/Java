import java.io.*;

class Phonebook
{
	String name,phone;
	Phonebook()
	{}
	Phonebook(String name,String phone)
	{
		this.name=name;
		this.phone=phone;
	}
	long store(RandomAccessFile f) throws IOException
	{
		long pos=f.getFilePointer();
		f.writeUTF(name);
		f.writeUTF(phone);
		return pos;
	}
	void access(RandomAccessFile f) throws IOException
	{
		name=f.readUTF();
		phone=f.readUTF();
		System.out.println(toString());
	}
	public String toString()
	{
		return "Name: "+name+"\tPhone: "+phone+"\n";
	}
}
public class PhonebookDemo
{

	public static void main (String[] args) throws IOException
	{
		RandomAccessFile f=new RandomAccessFile("phone.dat","rw");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Phonebook p;
		String name,phone;
		System.out.println("How Many entries");
		int n=Integer.parseInt(br.readLine());
		String nameTable[]=new String[n];
		long posTable[]=new long [n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name and phone no");
			 name=br.readLine();
			 phone=br.readLine();
			p=new Phonebook(name,phone);
			nameTable[i]=name;
			posTable[i]=p.store(f);
		}
		f.close();
		boolean  done=false;
		RandomAccessFile f1=new RandomAccessFile("phone.dat","r");
		Phonebook p1=new Phonebook();
		while(!done)
		{
			System.out.println("Enter name to search");
			 name=br.readLine();
			boolean found=false;
			for(int i=0;i<n;i++)
			if(nameTable[i].equals(name))
			{
				f1.seek(posTable[i]);
				p1.access(f1);
				found=true;
			}
			if(!found)
				System.out.println("Record not found");
			System.out.println("do you want to continue? Y/N");
			String ans=br.readLine();
			if(ans.equals("N"))
				done=true;
		}
		f1.close();
	}
}