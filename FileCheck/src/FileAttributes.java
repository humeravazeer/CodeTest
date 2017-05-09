
public class FileAttributes  {
	
	long size;
	String path;
	String name;

	public boolean equals(Object obj){
		FileAttributes f1 = (FileAttributes) obj;
		if((f1.getSize() == this.getSize()) && (f1.getName().equals(this.getName()))){
			/*System.out.println("true for" +f1.getName());*/
		return true;
				}
		else{
			/*System.out.println("false for"+f1.getName());*/
			return false;
		}
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setSize(long size) {
		this.size = size;
	}
	FileAttributes(){
		
	}

	FileAttributes(String n,long s,String p){
		name = n;
		size = s;
		path = p;
	}
	
	public String getName(){
		return name;
	}
	public String getPath(){
		return path;
	}
	public long getSize()
	{
		return size;
	}
	 public String toString(){
		 return path ;
	 }

}
