package lab6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program2 {
	public static void main(String[] args) {
		Map<String,Integer> hashmap=new HashMap<String,Integer>();
		BufferedReader br=null;
		try {
			 br=new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\execution\\lab6\\src\\lab6\\story"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line=null;
		try
		{
			while((line=br.readLine())!=null)
			{
				String[] tokens=line.split("");
				for(String token:tokens)
				{
					if(hashmap.containsKey(token))
					{
						int v=hashmap.get(token);
						hashmap.put(token, ++v);
					}
					else
					{
						hashmap.put(token,1);
					}
				}
			}
		}catch(IOException io)
		{
			io.printStackTrace();
		}
		Set<Entry<String,Integer>> entryset=hashmap.entrySet();
		for(Entry<String,Integer> setItem:entryset)
		{
			System.out.println(setItem.getKey()+ "  appear  "+setItem.getValue()+"times");
		}
	}
}
