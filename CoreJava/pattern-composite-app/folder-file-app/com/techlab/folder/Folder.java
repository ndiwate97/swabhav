package com.techlab.folder;

import java.util.ArrayList;
import java.util.List;

import com.techlab.htmlcreator.IHtml;

public class Folder implements IStorable {

	private String name;
	private static String dash = "-";
	private List<IStorable> children = new ArrayList<IStorable>();
	static int count = 0;
//	static StringBuilder dashes = new StringBuilder();

	public Folder(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addChildren(IStorable iStorable) {
		children.add(iStorable);
	}

	@Override
	public void display(StringBuilder dashes) {
		count++;
		for(int i = 0 ; i<count; i++) {
			dashes.append(dash);
		}
		
		
//		dashes.append(dash+name+"\n");
//		dash= "--";
		
		dashes.append(name+"\n\t");
		if (children != null) {
			
			for (IStorable element : children) {
				element.display(dashes);
			}
		}
		
		count--;
		System.out.println(dashes);
	}

}
