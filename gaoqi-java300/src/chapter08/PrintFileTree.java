package chapter08;

import java.io.File;

public class PrintFileTree {
	public static void main(String[] args) {
		File file = new File("D:/LoadTools/DownloadFiles/Movies&TV");
		
		printFile(file, 0);
	}
	
	static void printFile(File file, int level) {
		for(int i = 0; i < level; i++) {
			System.out.print("\t");
		}
		System.out.println(file.getName());
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			
			for(File f: files) {
				printFile(f, level + 1);
			}
		}
	}

}
