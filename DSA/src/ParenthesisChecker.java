import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
	public static boolean isBalanced(String str)
	{
		Stack <Character> s=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			char cur=str.charAt(i);
			if(isOpening(cur))
			{
				s.push(cur);
			}
			else
			{
				if(s.isEmpty())
				{
					return false;
				}
				else if(!isMatching(s.peek(),cur))
				{
					return false;
				}
				else 
				{
					s.pop();
				}
			}
		}
		return s.isEmpty();
	}
	
	
public static boolean isMatching(char a,char b)
{
	return (a=='[' && b==']') || (a=='{'&& b=='}' ) || (a=='('&& b==')');
}
	
public static boolean isOpening(char ch)
{
	return ch=='{'|| ch=='[' || ch=='(';
}
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String str=sc.next();
	if(isBalanced(str))
	{
		System.out.println("balanced");
	}
	else
		System.out.println("not balanced");
	

}
}
