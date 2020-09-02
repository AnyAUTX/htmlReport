import java.io.File;
	import java.io.IOException;
	import org.apache.commons.io.FileUtils;
	public class htmlreport2 {
	

		public static void main(String[] args) throws IOException    {
			        String v1 = "45", v2 = "60",v3="75";
			        long startTime = new Date().getTime();

					// ... the code being measured starts ...

					// sleep for 5 seconds
					TimeUnit.SECONDS.sleep(5);

					// ... the code being measured ends ...

					long endTime = new Date().getTime();

					long timeElapsed = endTime - startTime;

					System.out.println("Execution time in milliseconds: " + timeElapsed);
			        int r1 = 2222;
			        String chead = "<html><title>Welcome to AnyAUT</title><body><h2>AnyAUT HTML Test Report 0.1</h2><p></p>";
			        System.out.println(chead);
					String vTimer = "<p></p><p>Start Time :"+v1+"</p><p>End Time : " + v2 + "</p><p>Total Time : "+ v3 +"</p><p>Pass Percentage :</p><p></p>";
					// Looped for each Row and html file updated. 
					//String newRow = "<tr style='height: 21px;'>	<td style='width: 20%; height: 21px;'>" + r1 + " </td><td style='width: 20%; height: 21px;'>" + r1 + " </td><td style='width: 20%; height: 21px;'>" + r1 + " </td><td style='width: 20%; height: 21px;'>" + r1 + " </td><td style='width: 20%; height: 21px;'>" + r1 +" </td></tr>";


					String cfoot = "<p>This is end of the report</p></body></html>";
	               
	                // String mytable="<html><body><table bgcolor='red'border='1'style='width:100%'><tr><th>ffswd</th><th>dsag</th><th>gyg</th></tr><tr><td>fgd</td><td>fdbs</td><td>zbd</td></tr><tr><td>dfb</td><td>fdb</td><td>bdz</td></tr><tr><td>fzv</td><td>fgb</td><td>fdb</td></tr></table></body></html>";
	                
					String mytable1="<HR><br><br><table border='1'style='width:75%'>";
					String mytable2 = "</table>";
	                
	               
	                
	                String myTable = mytable1;
	                for (int i = 1 ; i <=20 ; i++) {
	                	myTable = myTable + insertHTMLRow("ID:" +i, "Pass", "C:\\Users\\naras\\OneDrive\\Desktop\\runner\\AnyAUT runner\\anyautBot-small.png");
	                }
	                
	                myTable = myTable + mytable2;
	                String myHTMLCode = chead + vTimer + myTable + cfoot;
	                File newHtmlFile = new File("myHTML_rep.html");
	                FileUtils.writeStringToFile(newHtmlFile, myHTMLCode);
	                 
	                System.out.println(insertHTMLRow("A", "B", "C"));
	                // new file...write "myHTMLCode" to file.....save file as .html
		}

		public static String insertHTMLRow(String c1, String c2, String c3) {
			
			String trStart = "<tr>";
			String trEnd = "</tr>";
			//String c1,  c2, c3;
			
			c1 = "<td>" + c1 + "</td>";
			c2 = "<td bgcolor='red'>" + c2 + "</td>";
			c3 = "<td>" + c3 + "</td>";
			
			return (trStart + c1 + c2 + c3 + trEnd);			
		}
}
