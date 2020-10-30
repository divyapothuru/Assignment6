package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(new File("C:\\Users\\DELL\\Desktop\\execution\\lab6\\src\\datanum"));
			double d=sc.nextDouble();
			while(sc.hasNextDouble())
			{
				double num=sc.nextDouble();
				if(num>d)
				{
					d=num;
				}
				
			}
			sc.close();
			System.out.println("large double number is:"+d);
		}catch(FileNotFoundException fe)
		{
			fe.printStackTrace();
		}catch(IOException io)
		{
			io.printStackTrace();
		}
	}
}
