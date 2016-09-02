class str
{
	public static void main(String args[]) 
	[
	String s = "danish is a bad boy" ;
	int a,b;
	String p;
	for(int i=0;i<s.length;i++)
	{
	  char ch=s.charAt(i);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')	
      a=s.indexOf(ch);
      break;
	}
	for(int i=0;i<s.length;i++)
	{
	  char ch=s.charAt(i);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')	
      b=s.lastIndexOf(ch);
      break;
	}
	System.out.print(s.substring(a,b));
	
}