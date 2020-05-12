package com.hht.wms.core.util;

import java.io.File;
import java.io.IOException;

public class FileUtils {
	public static void mkdirs(String filename) {
		System.out.println("fileseparator==========="+File.separator+"==============");
		String dir = filename.substring(0, filename.lastIndexOf(File.separator));
		File dirs = new File(dir);
		if(!dirs.exists()){
			dirs.mkdirs();
		}
		
		File f = new File(filename);
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String beginDate = "";
		System.out.println(beginDate.replace("-", ""));
		
		
	}
	
}
