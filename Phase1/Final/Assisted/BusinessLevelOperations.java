package developer.BusinessLevelOperation;
import java.awt.Desktop;
import com.proj.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class BusinessLevelOperations implements FileInterface   {
List<String >retrive =new ArrayList<String>();
File[]files =new File("/home/ruchikahonawale/Desktop/").listFiles();
public void showAllFiles() {
	for(File file:files) {
		if(file.isFile()) {
			retrive.add(file.getName());
			
		}
		
	}retrive.forEach(System.out::println);
}
public void addFile() {
	System.out.println("Enter the file to be added:");
	@SuppressWarnings("resource")
	Scanner scan=new Scanner (System.in);
String filename=scan.nextLine();
File F= new File(filename);
try {
	if (F.createNewFile()) {
		System.out.println(filename+ "File is added to the directory");
	Desktop.getDesktop().edit(F);
}
	else {
		System.out.println("This file is already existing.");
	}
}catch (IOException e) {
	e.printStackTrace();
}
}
public void deleteFile() {
	System.out.println("Enter the file to be deleted" );
@SuppressWarnings("resource")
Scanner scan=new Scanner(System.in);
String filename=scan.nextLine();
File F=new File (filename);
if (F.delete())
	System.out.println(filename+"got deleted");
else
	System.out.println("File Not Found");
}
public void searchFile() {
	try {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
File directory=new File("/home/ruchikahonawale/Desktop/project/hello");
		 System.out.println("Enter the file to be searched");
String filename=scan.nextLine();
@SuppressWarnings("unused")
File[]file =directory.listFiles();
int flag=0;
for (File file1:files) {
	 String name = file1.getName();
     if (name.equals(filename)) {
	File f=new File(filename);
	@SuppressWarnings("resource")
	Scanner sc1=new Scanner(f);
	while(sc1.hasNextLine()) {
		System.out.println();
		sc1.nextLine();
	}
	flag=1;
	
}
}
	if (flag==0) {
		System.out.println("File Not Found");
	}
}catch(FileNotFoundException ex) {
	System.out.println("File Not Found");
}
}
}
