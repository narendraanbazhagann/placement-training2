import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
         Stack<Character> stack = new Stack<>();
boolean valid = true;

for (char c : input.toCharArray()) {
   if (c == '(' || c == '{' || c == '[') {
       stack.push(c);
   } else if (c == ')' || c == '}' || c == ']') {
       if (stack.isEmpty()) {
           valid = false;
           break;
       }
       char top = stack.pop();
       if ((c == ')' && top != '(') || 
           (c == '}' && top != '{') || 
           (c == ']' && top != '[')) {
           valid = false;
           break;
       }
   }
}

if (!stack.isEmpty()) {
   valid = false;
}

System.out.println(valid);
		}
		
	}
}
