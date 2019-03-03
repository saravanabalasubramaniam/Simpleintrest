import java.io.*;
import java.util.*;
class Simpleintrest
{
public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int amount=input.nextInt();
	int time=input.nextInt();
	int rate=input.nextInt();
	int intrest=0;
	for(int i=0;i<time;i++)
	{
		intrest=intrest+rate;
	}
  System.out.println(intrest);
}
}
