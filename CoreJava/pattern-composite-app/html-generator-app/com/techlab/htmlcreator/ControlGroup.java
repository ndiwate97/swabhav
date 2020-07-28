package com.techlab.htmlcreator;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHtml{
	
	private String tag;
	public  List<IHtml> controls = new ArrayList<IHtml>();
	public 	StringBuilder controlGroup = new StringBuilder();
	
	public ControlGroup(String tag) {
		this.tag = tag;
	}

	public void addControl(IHtml element) {
		
		controls.add(element);
		
	}

	@Override
	public StringBuilder parseHtml() {
		controlGroup.append("<" + tag + ">\n");
		if (controls != null) {
			for (IHtml ihtmlElement : controls) {
				controlGroup.append(ihtmlElement.parseHtml());
			}
		}
		controlGroup.append("</" + tag + ">\n");
		
		return controlGroup;
	}
	
	@Override
	public String toString() {
		
		return controlGroup.toString();
	}
}
