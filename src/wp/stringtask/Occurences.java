package wp.stringtask;

public class Occurences {
	static int count;
	public static void main(String[] args) {
		String str=new String("this is java and java is object oriented and java is powerful. I love java language");

		int index=str.indexOf("java");
		while(index!=-1)
		{
			System.out.println(index);
			index=str.indexOf("java", index+1);
			count++;
			
		}
		System.out.println("No. of times java appeared: "+count);

	}

}
