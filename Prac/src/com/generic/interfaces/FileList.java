package com.generic.interfaces;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileList {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1,2,3);
		asList.stream();
		
		// List<File> listf =
		// listf("D:\\hybris_castle\\Castle_Bitbucket_Clone");
		List<File> listf = listf("D:\\castle_ext_amc\\ext-amc\\u01\\hybdev\\hybdevapp\\hybrissuite\\hybris\\bin\\ext-amc");
		// System.out.println(listf);
	}

	public static List<File> listf(String directoryName) {
		File directory = new File(directoryName);

		List<File> resultList = new ArrayList<File>();

		// get all the files from a directory
		File[] fList = directory.listFiles();
		resultList.addAll(Arrays.asList(fList));
		
		 List<File> asList = Arrays.asList(fList);
		 asList.forEach(x ->
	                    	 {
	                    		 if (x.isFile()) {
	                 				if (x.getName().endsWith(".class")) {
	                 					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	                 					String format = sdf.format(x.lastModified());
//	                 					System.out.println("Absolute Path is =" + file.getAbsolutePath() + " @@ and Last Modified Date is " + format);
	                 					System.out.println(x.getAbsolutePath() + " @@  Last Modified Date is " + format);
//	                 					 System.out.println(file.getName() +" = "+ format);
	                 				}
	                 			} else if (x.isDirectory()) {
	                 				resultList.addAll(listf(x.getAbsolutePath()));
	                 			}
		                     }
				      );
		 
		               
		
		
		
		/*for (File file : fList) {
			if (file.isFile()) {
				if (file.getName().endsWith(".class")) {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					String format = sdf.format(file.lastModified());
//					System.out.println("Absolute Path is =" + file.getAbsolutePath() + " @@ and Last Modified Date is " + format);
					System.out.println(file.getAbsolutePath() + " @@  Last Modified Date is " + format);
//					 System.out.println(file.getName() +" = "+ format);
				}
			} else if (file.isDirectory()) {
				resultList.addAll(listf(file.getAbsolutePath()));
			}
		}*/
		// System.out.println(fList);
		return resultList;
	}

}