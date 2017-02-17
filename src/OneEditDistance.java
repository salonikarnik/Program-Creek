/*
 * Given two strings S and T, determine if they are both one edit distance apart.
 */
import java.io.*;

public class OneEditDistance {
	
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a word");
		String s=br.readLine();
		System.out.println("Enter another word");
		String t=br.readLine();
		OneEditDistance object = new OneEditDistance();
		boolean answer=object.oneEdit(s,t);
		System.out.println("Are the two words one edit distance apart?");
		System.out.println("Answer: " + answer);
		
	}
	
	public boolean oneEdit(String s, String t){
		
		for(int i=0;i<Math.min(s.length(),t.length());i++){
			if(s.charAt(i)!=t.charAt(i)){
				if(s.length()==t.length())
					return s.substring(i+1).equals(t.substring(i+1)); //if lengths are equal, only 1 character needs to be replaced
				else if(s.length()>t.length())
					return s.substring(i+1).equals(t.substring(i)); //if s is the longer string, so deleting one character would make them equal
				else
					return t.substring(i+1).equals(s.substring(i));
			}
		}
		
		return Math.abs(s.length()-t.length())==1; //if the strings differ by a length greater than one, then they aren't one edit distance apart
	}

}
