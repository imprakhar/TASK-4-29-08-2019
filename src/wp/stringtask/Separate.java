package wp.stringtask;

public class Separate {

	public static void main(String[] args) {
		String s="India,Australia,England,Spain,Canada";
		char[] ch=s.toCharArray();
		int j=0;
		for(int i=0;i<ch.length;i++)
		{
			if(s.charAt(i)==',')
			{
				System.out.println(s.substring(j, i));
				j=i+1;
			}
		}
		System.out.println(s.substring(s.lastIndexOf(',')+1,s.length()));
	}

}
