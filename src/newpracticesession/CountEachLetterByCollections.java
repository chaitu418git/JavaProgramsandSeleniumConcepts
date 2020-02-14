package newpracticesession;

import java.util.Collections;
import java.util.HashMap;

public class CountEachLetterByCollections {

	public static void main(String[] args) {
		String s="Hyderabad";
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		for (Character c: s.toCharArray())
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);

	}

}
