package samplepk;
import java.io.*;
public class Arraymulti {

	private static int k;

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		// Double dimensional
		int[][][]a=new int[2][3][4];
		
		// declare inputstream and bufferreader object
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(is);
		
		
			
		// store the values in a variable
		System.out.println("Please Enter any five integer values");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<4;k++)
				{
				System.out.println("a["+i+"]["+j+"][ "+k+",= ");
				a[i][j][k]=Integer.parseInt(b.readLine());	
			}
		}
	
		
		// display the values
		System.out.println("Given array values...");
		for(int i1=0;i1<2;i1++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<4;k++)
				{
			}
				System.out.print(a[i1][j][k]+" ");	
			}
			
			System.out.println("");
				
		}}
	

	}

}
