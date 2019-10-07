package newLab4;

import java.util.*;

public class Element {
	private String tag;
	private String elementValue;
	private ArrayList<Element> subElements;
	private Boolean isOneLiner;
	
	public Element(String nameTag, String elementValue, boolean iol) {
		this.tag = nameTag;
		this.elementValue = elementValue;
		this.isOneLiner = iol;
		subElements = new ArrayList<>();
	}
	
	public String getTag() {
		return this.tag;
	}
	
	public boolean isOL() {
		return this.isOneLiner;
	}
	
	public void addSubElements(String tagName, String elementValue) {
		Element elem = new Element(tagName, elementValue, true);
		subElements.add(elem);
	}
	
	
	public String toString() {
		String start = "<" + this.getTag() + ">" + "\n";
		for(Element elem : subElements) {
			start += "\t" + elem.toString() + ">" + "\n";
		}
		
		start += "<" + this.getTag() + "/>";
		return start;
	}
	
	public static void main(String[] args) {
		
		Element testElem = new Element("class", " math", true);
		testElem.addSubElements("courseCode", "SYSC3110");
		testElem.addSubElements("sport", "soccer");
		testElem.addSubElements("beverage",  "coffee");
		testElem.addSubElements("course", "nazifa");
		System.out.println(testElem.toString());
		
		
		
		// TODO Auto-generated method stub

	}

}
