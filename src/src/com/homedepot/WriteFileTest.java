package com.homedepot;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileOutputStream;
public class WriteFileTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.now();
		String folderName = dtf.format(localDate);
		wrtieFile(folderName);
	}

	
public static void wrtieFile(String folderName){
	
	
	 Date date = new Date() ;
	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmss");
	String user = "prem:sample_1234";
	NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(user);
	SmbFile sFile;
	String mainPath = "smb://WD00079/xmlFile/";
	try {
	sFile = new SmbFile(mainPath , auth);
	sFile.connect();
	new File("//WD00079/xmlFile/"+folderName).mkdir();
	String path = "smb://WD00079/xmlFile/"+folderName+"/tXMl"+dateFormat.format(date)+".xml";
	System.out.println("path = "+ path);
		String fileContent = "<tXML><header>Sample XML Test</header><messages><TasData><clockIn>2017-07-03 11:36</clockIn></TasData></messages></TXML>";
		sFile = new SmbFile(path, auth);
		
	    SmbFileOutputStream sfos;
	
		sfos = new SmbFileOutputStream(sFile);
		
	sfos.write(fileContent.getBytes());
	sfos.close();
	System.out.println("Files sent successful");
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (  IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
