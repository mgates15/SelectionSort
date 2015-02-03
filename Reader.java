import java.io.*;
import java.util.*;
public class Reader {
	public static int[] read(){
		String fileName = "MichaelGatesArray.txt";
		File file = new File(fileName);
		Scanner input = null;
		try
		{
			input = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
		System.out.println();
		}
		int[] num = new int[250];
		
		for(int i = 0; i<250; i++){
		num[i] = input.nextInt();
			}
		
		return num;}
}

***Worked on with Malcolm Akinje
