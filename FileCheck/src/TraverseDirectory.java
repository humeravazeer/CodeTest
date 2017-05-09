import java.io.File;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.io.*;
import java.util.logging.*;
public class TraverseDirectory {
	ArrayList<FileAttributes> endFiles = new ArrayList<FileAttributes>();
	
	
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("MyLog");  
	    FileHandler fh;  
	    logger.setUseParentHandlers(false);
		

		TraverseDirectory td = new TraverseDirectory();	
		TraverseDirectory td1 = new TraverseDirectory();
		
		try{
			
			fh = new FileHandler("C:/Humera/MyLogFile.log");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter); 		
		
			File original = new File(args[0]);
			File backup = new File(args[1]);
			td.traverse(original, " ");
			td1.traverse(backup, " ");
			logger.info("files processing started");
			System.out
					.println("************ Before processing the files in the original and backup directories are***************");
			System.out.println(td.endFiles);
			System.out.println(td1.endFiles);
			logger.info("calling path to be deleted method ");
			ArrayList<FileAttributes> path1 = td.pathTobedeleted(td.endFiles,
					original);
			ArrayList<FileAttributes> path2 = td1.pathTobedeleted(td1.endFiles,
					backup);
			/*
			 * System.out.println(
			 * "****************after path deletion**************");
			 * System.out.println(path1); System.out.println(path2);
			 */
			td.compareList(path1, path2);
		logger.info("successful comparison is completed");
		}
		catch(SecurityException e){
			
		}
		catch(IOException e){
			
		}
				
	}	
	

	public void traverse(File parentNode, String leftIndent) {
		if (parentNode.isDirectory()) {
			System.out.println(leftIndent + parentNode.getName());

			leftIndent += "   ";

			File childNodes[] = parentNode.listFiles();
			for (File childNode : childNodes) {
				traverse(childNode, leftIndent);
			}
			for (int i = 0; i < childNodes.length; i++) {
				System.out.println(childNodes[i]);
			}

		} else {
			System.out.println(leftIndent + parentNode.getName());
			FileAttributes file1 = new FileAttributes(parentNode.getName(),parentNode.length(),parentNode.getAbsolutePath());
			endFiles.add(file1);
		}

	}
	
	public ArrayList<FileAttributes> pathTobedeleted(ArrayList<FileAttributes> f1, File f ){
		
		ArrayList<FileAttributes> deletedPath = new ArrayList<FileAttributes> ();
	
		
		for(FileAttributes fa : f1){
			String path = fa.path;
			String base = f.getAbsolutePath() ;
			String relative = new File(base).toURI().relativize(new File(path).toURI()).getPath();
			/*System.out.println(relative +" the size of the file is  " +  fa.size);*/
			FileAttributes obj = new FileAttributes(fa.getName() , fa.size, relative);
			deletedPath.add(obj);
			
		}
		/*System.out.println("after deletion"+deletedPath);*/
		return deletedPath;
		
		
	}
	
	public void compareList(ArrayList<FileAttributes> a1, ArrayList<FileAttributes> a2 ){
		
		/*System.out.println("Inside compare method");
		System.out.println(a1);
		System.out.println(a2);*/
	    Iterator<FileAttributes> a1Iterator = a1.iterator();
	    
		/*System.out.println("Start of Equal");*/
		
		
		while(a1Iterator.hasNext()){
			FileAttributes fileAttr1 = (FileAttributes)a1Iterator.next();

			Iterator<FileAttributes> a2Iterator = a2.iterator();				
			
			while(a2Iterator.hasNext()){
				FileAttributes fileAttr2 = (FileAttributes)a2Iterator.next();

				if(fileAttr1.equals(fileAttr2))
				{
					a2Iterator.remove();
					a1Iterator.remove();
					break;
				}
			}
		}
		
		System.out.println("*****************The difference in files after Processing is ************************");
		System.out.println("Files in original" +a1);
		System.out.println("Files in backup" +a2);
		TraverseDirectory td3 = new TraverseDirectory();
		td3.createHashMap(a1, a2);
	}
	
	public void createHashMap(ArrayList<FileAttributes> a1, ArrayList<FileAttributes> a2 ){
		
		HashMap<String, ArrayList<FileAttributes>> finalResult = new HashMap<String, ArrayList<FileAttributes>>();
		finalResult.put("Original File", a1);
		finalResult.put("Backup files", a2);
		System.out.println( "Hash map" +finalResult);
		
		
		/*TreeMap<String, ArrayList<FileAttributes>> tm = new TreeMap<String, ArrayList<FileAttributes>>();
		for(FileAttributes fa :a1){
			tm.put("Original", fa.getPath());
			tm.pu*/
		}
		
		
	}
	
	

