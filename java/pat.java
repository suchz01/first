import java.io.*;
class pat
{
	public static void main(String args[])
	{	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		System.out.println("Enter n:");
		try{
			n=Integer.parseInt(br.readLine());
		}catch(Exception e){};
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
				System.out.print("  ");
			for(int j=i;j<=n;j++)
				System.out.print(j+" ");
			System.out.println("");
			
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<i;j++)
				System.out.print("  ");
			for(int j=i;j<=n;j++)
				System.out.print(j+" ");
			System.out.println("");
			
		}
	}
}
			