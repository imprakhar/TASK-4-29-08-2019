package wp.stringtask;

public class Ascending {
	public static void main(String[] args) {
		String[] str = { "indore","bhopal","mumbai","delhi","chennai" };
		for(int i=0;i<str.length;i++)
		{
			for(int j=1;j<str.length-i;j++)
			{
				if(str[j].compareTo(str[j-1])<0)
				{
					String temp="";
					temp=str[j-1];
					str[j-1]=str[j];
					str[j]=temp;
				}
			}
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
	
}
