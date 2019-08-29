package wp.stringtask;

public class Domain {
	static int countGmail;
	static int countYahoo;
	static int countOutlook;
	public static void main(String[] args)
	{
		String[] str = {"abc@gmail.com","def@gmail.com","ghi@gmail.com","jkl@yahoo.com","mno@outlook.com","pqr@gmail.com","xyz@outlook.com"};
		for(int i = 0;i<str.length;i++)
		{
			int index = str[i].lastIndexOf('@');
			char ch=str[i].charAt(index+1);
			if(ch=='g')
			{
				countGmail++;
			}
			else if(ch=='o')
			{
				countOutlook++;
			}
			else if(ch=='y')
			{
				countYahoo++;
			}
			else
			{
				System.out.println("Email Not Found");
			}
		}
		System.out.println("Gmail Accounts: "+countGmail+"\nOutlook Accounts: "+countOutlook+"\nYahoo Accounts: "+countYahoo);
	}

}
