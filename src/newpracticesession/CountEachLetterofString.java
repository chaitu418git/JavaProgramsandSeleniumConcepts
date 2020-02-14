package newpracticesession;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class CountEachLetterofString {

	public static void main(String[] args) {
		String s="testings";
Map<Character, Integer> map=new HashedMap<Character, Integer>();
for(Character c:s.toCharArray())
{
	if(map.containsKey(c)) {
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
