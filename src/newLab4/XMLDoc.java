package newLab4;

import java.util.*;

public class XMLDoc {
	
	private Element elem;
	private ArrayList<Element> list;
	
	public XMLDoc(String nameTag, String elementName) {
		elem= new Element(nameTag, elementName, false);
		list = new ArrayList<>();
	}
	
	
	public String toString() {
		return elem.toString();
	}

	
	public static void main(String[] args) {
		
		
		XMLDoc testXML = new XMLDoc("exampletag", "sysc");
		System.out.println(testXML.toString());
		
		Element testE = new Element("name", "Abdulla", true);
		testXML.list.add(testE);
		
		
		
		
		
		System.out.println(testXML.toString());
		
		// TODO Auto-generated method stub

	}

}
