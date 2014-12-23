//Sean Staz
//CSci 112
//Java II

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lab3 
{
	public static void main(String[] args)
	{
		ArrayList<String> aList = new ArrayList<String>();
		String  str = " The * quick * brown * fox * kicked * the * lazy * dog ";
		StringTokenizer strTokenizer = new StringTokenizer(str.trim(), "* ");

		while (strTokenizer.hasMoreTokens())
		{
			aList.add(strTokenizer.nextToken());
		}
		
		for (String name : aList)
		{
			System.out.println(name);
		}			
	}
}
