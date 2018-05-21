package PracticeSel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFilesReusbls {
   private String filepath;
   private FileWriter fw;
   private BufferedWriter bw;
   private FileReader fr;
   private BufferedReader br;

public TextFilesReusbls(String filepath) throws IOException {
	   this.filepath=filepath;
	   File file = new File(filepath);
	   if(file.createNewFile())
	   {
		System.out.println("file is created newly");   
	   }
	   else {
		   System.out.println("return existing file");
	   }
	    fw=new FileWriter(file);
	    bw=new BufferedWriter(fw);
	    fr=new FileReader(file);
	    br=new BufferedReader(fr);
   }
     public void write(String str) throws IOException {
    	 if(bw!=null) {
    		 bw.write(str);
    		 bw.flush();
    	 }
    	/* public void writeintdata(int data) throws IOException
    	 {
    	if(bw!=null) {
    		bw.write(data);
    		bw.newLine();
    		bw.flush();
    	}*/
    	 //}
     }
}
