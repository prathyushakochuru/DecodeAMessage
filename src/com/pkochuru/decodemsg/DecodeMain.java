package com.pkochuru.decodemsg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DecodeMain {

	public static void main(String[] args) {
		
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		map.put(4, 'd');
		map.put(5, 'e');
		map.put(6, 'f');
		map.put(7, 'g');
		map.put(8, 'h');
		map.put(9, 'i');
		map.put(10, 'j');
		map.put(11, 'k');
		map.put(12, 'l');
		map.put(13, 'm');
		map.put(14, 'n');
		map.put(15, 'o');
		map.put(16, 'p');
		map.put(17, 'q');
		map.put(18, 'r');
		map.put(19, 's');
		map.put(20, 't');
		map.put(21, 'u');
		map.put(22, 'v');
		map.put(23, 'w');
		map.put(24, 'x');
		map.put(25, 'y');
		map.put(26, 'z');
		
		int data = 126789;
		
		String[] strArr = Integer.toString(data).split("");
		
		System.out.println("Printing data string []: ");
		
		for(String x : strArr)
		{
			System.out.println(x);
		}
		
		
		
		Set entryset = map.entrySet();
		
		Iterator it = entryset.iterator();
		
		System.out.println("Printing HashMap:");
		
		while(it.hasNext())
		{
			Map.Entry m = (Map.Entry)it.next();
			System.out.println("Key : " +m.getKey() + " Value: "+ m.getValue());
		}
		
		System.out.println("Number of times " + data + " can be decoded: " + decode(map, data));

	}
	public static int counter = 0;
	public static int decode(HashMap<Integer, Character> hash, int input )
	{
		String strArr = String.valueOf(input);
		String substr = strArr.substring(0,1);
		String substr1 = strArr.substring(0,2);
		String substr2 = strArr.substring(1,strArr.length());
		//System.out.println("1st number: "+ substr);
		
		
		if(strArr!=null)
		{
			
			int x = Integer.valueOf(substr);
			System.out.println("ParsedInt: "+ x);
			//char code = hash.get(x);
			//System.out.println(code);
			if(hash.get(x)!=null)
			{
				counter++;
			}
						
			int y = Integer.valueOf(substr1);
			
			System.out.println("Second ParsedInt: "+ y);
			
			System.out.println("third String: "+ substr2);
			
			//char code1 = hash.get(y);
			if(hash.get(y)!=null)
			{
				counter++;
			}
			if(substr2.length() > 1)
			{
			decode(hash, Integer.valueOf(substr2));
			counter ++;
			}

		
		}

		return counter;
		
	}

}
