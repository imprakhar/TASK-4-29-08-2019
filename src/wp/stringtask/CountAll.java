package wp.stringtask;

public class CountAll {
	static int countSmallAlphabets;
	static int countCapitalAlphabets;
	static int countSymbols;
	static int countDigits;
	static int countSpaces;
	
	public static void main(String[] args) {
		String s="hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLetter(ch[i]))
			{
				int n=(int) ch[i];
				if(n>96 && n<123)
				{
					countSmallAlphabets++;
				}
				else
				{
					countCapitalAlphabets++;
				}
			}
			else if(Character.isDigit(ch[i]))
			{
				countDigits++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				countSpaces++;
			}
			else
			{
				countSymbols++;
			}
		}
		System.out.println("Small case alphabets: "+countSmallAlphabets+"\nUpper case alphabets: "+countCapitalAlphabets+"\nDigits: "+countDigits+"\nSymbols: "+countSymbols+"\nSpaces: "+countSpaces);
	}

}
