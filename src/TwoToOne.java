//https://www.codewars.com/kata/two-to-one/train/java
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TwoToOne {
    public static String longest (String s1, String s2) {
    	char tempArray[] = (s1 + s2).toCharArray(); 
    	Arrays.sort(tempArray); 
        String combi = new String(tempArray);
        String result = "";
        
        for (int i = 0; i < combi.length(); i++) {
        	char c = combi.charAt(i);
        	String s = String.valueOf(c);
        	
			if(result.contains(s) == false)
			{
				result += c;
			}
		}
    	return result;
    }
    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", longest("inmanylanguages", "theresapairoffunctions"));
    }
}
