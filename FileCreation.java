package document;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FileCreation {
	
	String fileName="";
	
	FileCreation()
	{
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			String extension=dateFormat.format(date);
			File file = new File("C:/sunil/filename_"+extension+".html");
			
			this.fileName="C:/sunil/filename_"+extension+".html";
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("<html>");
			bw.write("<h1>Test Case"+ extension+"</h1>");
			bw.write("<table border=\"1\">");
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	void addText(String message)
	{
	try {
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append("<tr>");
		bw.append("<td>");
				bw.append("No");
		bw.append("</td>");
			
		bw.append("<td>");
			bw.append(message);
		bw.append("</td>");
	
		
		bw.append("</tr>");
		bw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	
	void endText()
	{
	try {
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append("</table>");
		bw.append("</html>");
		bw.close();

	} catch (IOException e) {
		e.printStackTrace();
	}

}
	
}
