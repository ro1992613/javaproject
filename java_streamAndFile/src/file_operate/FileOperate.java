package file_operate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperate {
	//1.创建文件夹
	public void createFolder(String folderPath){
		File myFolderPath = new File(folderPath);   
		try {   
		    if (!myFolderPath.exists()) {   
		       myFolderPath.mkdir();   
		    }   
		}   
		catch (Exception e) {   
		    System.out.println("新建目录操作出错");   
		    e.printStackTrace();   
		}    
	}
	
	//2.创建文件   
	public void createFile(String filePath){
		File myFilePath = new File(filePath);   
		try {   
		    if (!myFilePath.exists()) {   
		        myFilePath.createNewFile();   
		    }   
		}   
		catch (Exception e) {   
		    System.out.println("新建文件操作出错");   
		    e.printStackTrace();   
		}    
	}
	
	//3.删除文件   
	public void deleteFile(String filePath){
		File myDelFile = new File(filePath);   
		try {   
		    myDelFile.delete();   
		}   
		catch (Exception e) {   
		    System.out.println("删除文件操作出错");   
		    e.printStackTrace();   
		}    
	}
	
	//4.删除空文件夹   
	public void deleteFolder(String folderPath){
		File delFolderPath = new File(folderPath);   
		try {   
		    delFolderPath.delete(); //删除空文件夹   
		}   
		catch (Exception e) {   
		    System.out.println("删除文件夹操作出错");   
		    e.printStackTrace();   
		}  
	}
	
	//5.删除一个文件下夹所有的文件夹 
	public void deleteAllFile(String folderPath){
		File delfile=new File(folderPath);   
		File[] files=delfile.listFiles();   
		for(int i=0;i<files.length;i++){   
		    if(files[i].isDirectory()){   
		        files[i].delete();   
		    }   
		}     
	}
	
	//6.清空文件夹 
	public void clearFolder(String folderPath){
		File delfilefolder=new File(folderPath);   
		try {   
		    if (!delfilefolder.exists()) {   
		        delfilefolder.delete();   
		    }   
		    delfilefolder.mkdir();   
		}   
		catch (Exception e) {   
		    System.out.println("清空目录操作出错");   
		    e.printStackTrace();   
		}    
	}
	
	//7.以文件流的方式复制文件
	public void copyFile(String src,String dest) throws IOException{
        FileInputStream in=new FileInputStream(src);
        File file=new File(dest);
        if(!file.exists())
            file.createNewFile();
        FileOutputStream out=new FileOutputStream(file);
        int c;
        byte buffer[]=new byte[1024];
        while((c=in.read(buffer))!=-1){
            for(int i=0;i<c;i++)
                out.write(buffer[i]);        
        }
        in.close();
        out.close();
    }
	
	
	//8.利用BufferedReader读取
	public String readFileByBufferedReader(String path) throws IOException{
		File file=new File(path);
        if(!file.exists()||file.isDirectory())
            throw new FileNotFoundException();
        BufferedReader br=new BufferedReader(new FileReader(file));
        String temp=null;
        StringBuffer sb=new StringBuffer();
        temp=br.readLine();
        while(temp!=null){
            sb.append(temp+" ");
            temp=br.readLine();
        }
        return sb.toString();
	}
	
	
	//9.利用FileInputStream读取文件
	public String readFileByInputStream(String path) throws IOException{
		File file=new File(path);
        if(!file.exists()||file.isDirectory())
            throw new FileNotFoundException();
        FileInputStream fis=new FileInputStream(file);
        byte[] buf = new byte[1024];
        StringBuffer sb=new StringBuffer();
        while((fis.read(buf))!=-1){
            sb.append(new String(buf));    
            buf=new byte[1024];//重新生成，避免和上次读取的数据重复
        }
        return sb.toString();
	}
}
