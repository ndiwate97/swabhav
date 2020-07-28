package com.techlab.htmlcreator;

public class Control implements IHtml {

	private String tag;
	private String type;
	private String value;

	public StringBuilder control = new StringBuilder();

	public Control(String tag) {
		this.tag = tag;
	}

	public Control(String tag, String type, String value) {
		this(tag);
		this.type = type;
		this.value = value;
		parseHtml();
	}

	@Override
	public StringBuilder parseHtml() {
		if (type != null) {
			control.append("<" + tag + " " + "type=" + type + " value=" + value + " >");
			control.append("</" + tag + ">");
			return control;
		} else {
			control.append("<" + tag + " >");
			control.append("</" + tag + ">");
			return control;
		}
		
	}

	@Override
	public String toString() {
		
		return control.toString();
	}
}
