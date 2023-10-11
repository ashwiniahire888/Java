 import java.io.*;
 class ItemDemo
 {
 public static void main (String args[])
 {
 int id,i,n,choice;
 String name,iname=null;
 double price;
 int quantity;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 try
 {
	 RandomAccessFile file=new RandomAccessFile("item.dat","rw");
	 System.out.println("how many item?");
	 n=Integer.parseInt(br.readLine());
	 for(i=1;i<=n;i++)
 	{
		System.out.println("enter id,name,price,quantity");
 		id=Integer.parseInt(br.readLine());
 		file.writeInt(id);
 		name=br.readLine();
 		file.writeUTF(name);
 		price=Double.parseDouble(br.readLine());
 		file.writeDouble(price);
 		quantity=Integer.parseInt(br.readLine());
 		file.writeInt(quantity);
 	}
 do
 	{
 		System.out.println("1)search for specific item name\n");
 		System.out.println("2)findcostlist item\n");
 		System.out.println("3)Display all item&total cost\n");
 		System.out.println("4)Exit\n");
 		System.out.println("enter your choice");
 		choice=Integer.parseInt(br.readLine());
 		switch(choice)
 		{
 			case 1:
 				boolean flag=flag=false;
 			System.out.println("enter name to search");
 			iname=br.readLine();
 			file.seek(0);
 			while(true)
			{
				id=file.readInt();
				name=file.readUTF(); 
 				price=file.readDouble();
 				quantity=file.readInt();
 				if(name.equals(iname))
 				{
 					System.out.println("item name is found");
 					System.out.println(id+name+"\t"+price+"\t"+quantity);
 					flag=true;
 					break;
 				}
 			}
 			if(	flag=false)
 				System.out.println("item name is not found");
 			break;
		    case 2 : double max=0;
 			file.seek(0);
 			for(i=1;i<=n;i++)
 			{
 				id=file.readInt();
 				name=file.readUTF();
 				price=file.readDouble();
				quantity=file.readInt();
 				if(price>max)
 				{
  					max=price;
 					iname=name;
 				}
 			}
 			System.out.println("cost list litem is"+iname+"& its price is :" + max);
 				break;
 			case 3: double total=0;
 					file.seek(0);
 					for(i=1;i<=n;i++)
 					{
	 					id=file.readInt();
						name=file.readUTF();
	 					price=file.readDouble();
	 					quantity=file.readInt();
	 					total+=price;
	 					System.out.println(id+"\t"+name+"\t"+price+"\t"+quantity);
					}
					System.out.println("Total cost"+total);
 						break;
 			case 4: System.exit(0);
			}
 		}while(choice!=4);
 	}
 	catch(Exception e)
 	{}
 	}
 }