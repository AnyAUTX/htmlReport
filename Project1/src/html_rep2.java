import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class html_rep2 {

	public static void main(String[] args) throws IOException    {
		        String v1 = "35", v2 = "60",v3="75";
		        int r1 = 2222;
		        System.out.println(" ");
		        String chead = "<html><body><h2>AnyAUT HTML Test Report</h2><p></p>";
		        System.out.println(chead);
				String vTimer = "<p></p><p>Start Time :"+v1+"</p><p>End Time : " + v2 + "</p><p>Total Time : "+ v3 +"</p><p>Pass Percentage :</p><p></p>";
				// Looped for each Row and html file updated. 
				String newRow = "<tr style='height: 21px;'>	<td style='width: 20%; height: 21px;'>" + r1 + " </td><td style='width: 20%; height: 21px;'>" + r1 + " </td><td style='width: 20%; height: 21px;'>" + r1 + " </td><td style='width: 20%; height: 21px;'>" + r1 + " </td><td style='width: 20%; height: 21px;'>" + r1 +" </td></tr>";


				String cfoot = "</table><p></p></body></html>";
                String myHTMLCode = chead + vTimer + newRow +cfoot;
                String report = "test.txt";
                File myfile = new File(report);
                Scanner mydata = new Scanner(myfile);
                
                // For Scanner to read the whole  file
                while(mydata.hasNextLine()){
                    System.out.println(mydata.nextLine());
                }
                File newHtmlFile = new File("myHTML_rep.html");
                FileUtils.writeStringToFile(newHtmlFile, myHTMLCode);
                
                mydata.close();
                // new file...write "myHTMLCode" to file.....save file as .html
	}

}
