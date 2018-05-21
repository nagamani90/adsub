package PracticeSel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TextTest {
public static void main(String[] args) throws Exception {
	File file=new File("C:\\Users\\arte207_mahesh\\Desktop\\mhs.txt");
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	String line1=br.readLine();
	System.out.println(line1);
	String line2=br.readLine();
	System.out.println(line2);
	String line3=br.readLine();
	System.out.println(line3);
	while(br.ready())
	{
		String text=br.readLine();
		System.out.println(text);
	}
}
}
