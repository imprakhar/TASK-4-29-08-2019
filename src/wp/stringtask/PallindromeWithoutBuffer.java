package wp.stringtask;

public class PallindromeWithoutBuffer {

	public static void main(String[] args) {
		String str="abcdefghijklmnop";
		char[] ch=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println("Given string: "+str);
		System.out.println("Reverse of given string: "+rev);
	}
}
