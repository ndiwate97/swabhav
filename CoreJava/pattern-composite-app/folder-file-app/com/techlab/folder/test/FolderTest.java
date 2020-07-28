package com.techlab.folder.test;

import com.techlab.folder.*;

public class FolderTest {

	static StringBuilder dashes = new StringBuilder();

	public static void main(String[] args) {

		Folder movieFolder = new Folder("movie");
		Folder actionFolder = new Folder("action");
		Folder comedyFolder = new Folder("comedy");
		Folder actionComedyFolder = new Folder("action comedy");

		File abcFile = new File("abc", 100, "avi");
		File defFile = new File("def", 100, "mp4");
		File mnoFile = new File("mno", 100, "avi");
		File pqrFile = new File("pqr", 100, "mp4");
		File xyzFile = new File("xyz", 100, "avi");
		File ghiFile = new File("ghi", 100, "mp4");

		movieFolder.addChildren(actionFolder);
			actionFolder.addChildren(actionComedyFolder);
		movieFolder.addChildren(comedyFolder);

		actionFolder.addChildren(abcFile);
		actionFolder.addChildren(defFile);
		actionFolder.addChildren(pqrFile);
		comedyFolder.addChildren(xyzFile);
		comedyFolder.addChildren(ghiFile);

		actionComedyFolder.addChildren(mnoFile);

		movieFolder.display(dashes);
	}

}
