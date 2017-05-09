
import java.io.File;
 
public class DisplayDirectory{
 
	public static void main (String args[]) {
 
		displayIt(new File("D:/A"));
	}
 
	public static void displayIt(File node){
		
	
 
		System.out.println(node.getName());
		System.out.println(node.length());
 
		if(node.isDirectory()){
			String[] subNote = node.list();
			for(String filename : subNote){
				displayIt(new File(node, filename));
			}
			
			
		}
		
		
 
	}
}