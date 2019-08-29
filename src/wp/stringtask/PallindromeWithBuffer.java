package wp.stringtask;
 
public class PallindromeWithBuffer {
	public void checkPallindrome(String s1,String s2)
	 {
		 if(s1.equals(s2))
		 {
			 System.out.println("String : "+s1+" is Pallindrome");
		 }
		 else
		 {
			 System.out.println("String : "+s1+" is not Pallindrome");
		 }
	 }
	public static void main(String[] args) {
		String s=new String("abcxyz");
		String s1=new String("abccba");
		StringBuffer sb=new StringBuffer("abccba");
		StringBuffer sb1=new StringBuffer(s);
		PallindromeWithBuffer pwb=new PallindromeWithBuffer();
		pwb.checkPallindrome(s,sb1.reverse().toString());	
		pwb.checkPallindrome(s1,sb.reverse().toString());
		
	}
}
