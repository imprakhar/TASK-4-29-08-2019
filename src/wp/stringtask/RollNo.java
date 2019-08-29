package wp.stringtask;

public class RollNo {
	static int cs; //starting with 12
	static int ec; //starting with 34
	static int mech; //starting with 56
	static int civil; // starting with 78
	public static void main(String[] args) {
		String[] str= {"123456","783456","123456","123456","123456","783456","563456","563456","123456","343456","563456","123456","343456"};
		for(int i=0;i<str.length;i++)
		{
			if(str[i].indexOf("12")==0)
			{
				cs++;
			}
			else if(str[i].indexOf("34")==0)
			{
				ec++;
			}
			else if(str[i].indexOf("56")==0)
			{
				mech++;
			}
			else if(str[i].indexOf("78")==0)
			{
				civil++;
			}
		}
		System.out.println("CS Students: "+cs+"\nEC Students: "+ec+"\nMech Students: "+mech+"\nCivil Students: "+civil);
	}

}
