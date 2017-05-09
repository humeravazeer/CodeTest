import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.*;
import java.util.*;
import java.io.*;
public class Test1 {

	public static void main(String[] args) {
		
		
		/*Logger logger = Logger.getLogger("MyLog");  
	    FileHandler fh;  
	    logger.setUseParentHandlers(false);

	    try {  

	        // This block configure the logger with handler and formatter  
	        fh = new FileHandler("C:/Humera/MyLogFile.log");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);  

	        // the following statement is used to log any messages  
	        logger.info("My first log");  

	    } catch (SecurityException e) {  
	        e.printStackTrace();  
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }  

	    logger.info("Hi How r u?");  

	}

		/*
		 * String toBeDeleted = "";
		 * 
		 * File file = new File("D:/A/B"); ArrayList<FileAttributes> list = new
		 * ArrayList<FileAttributes>();
		 */
		/*
		 * toBeDeleted = file.getParent(); System.out.println("*****"+
		 * toBeDeleted); TraverseDirectory td = new TraverseDirectory();
		 * td.traverse(file," "); System.out.println(td.endFiles);
		 */

		/*
		 * String path = "D:/A/B/dd.txt"; String base = "D:/A"; String relative
		 * = new File(base).toURI().relativize(new
		 * File(path).toURI()).getPath(); System.out.println(relative);
		 */

		/*ArrayList<String> ar1 = new ArrayList<String>();

		ar1.add("asdfsadf");
		ar1.add("asdfsadf");
		ar1.add("asdfsadf");
		ar1.add("asdf");
		ar1.add("asdfsadf");
		ar1.add("asdfsadf");
		ar1.add("asdfsadf");
		ar1.add("asdf");
		ar1.add("asdfsadf");
		ar1.add("asdfsadf");
		ar1.add("asdfsadf");

		System.out.println(ar1.size());
		System.out.println(ar1);

		System.out
				.println("after processing ***************************************");

		Iterator<String> i = ar1.iterator();
		while (i.hasNext()) {
			if (i.next().equalsIgnoreCase("asdf")) {
				i.remove();
			}
		}

		
		
		
		/*for (int x = 0; x < 15; x++) {
			System.out.println("x = " + x);
			
			System.out.println(x + "before continue");
			if (x > 5) {
				System.out.println("now i is greater than 5");
				break;
			}
			System.out.println(x + " after continue ");

			System.out.println(x + " after continue ");
			System.out.println(x + " after continue ");
			System.out.println(x + " after continue ");
			System.out.println(x + " after continue ");
			System.out.println(x + " after continue ");
			
			

		}

		
		

		/*
		 * for (FileAttributes fileAttributes : list) {
		 * fileAttributes.setName(fileAttributes
		 * .getName().substring(toBeDeleted.length())); }
		 */
		//Some comments TODO:

	}

}
