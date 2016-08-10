
import java.io.*;

public class WriteFile {
	
	public void Write(String filePath, String str)
	{
		File f = new File(filePath);
		
		FileWriter fw;
		try {
			f.createNewFile();
			fw = new FileWriter(f,true);
			BufferedWriter yaz = new BufferedWriter(fw);
			yaz.write(str);
			yaz.flush();
			yaz.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	
	

}
