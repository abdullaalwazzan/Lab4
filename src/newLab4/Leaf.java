package newLab4;

public class Leaf extends Element{
	
	public Leaf(String tagName, String elementValue){
		super(tagName, elementValue, true);
	}
	
	
	public String getTagName() {
		return this.tagName;
	}
	
	public String toString() {
		return this.oneLine;
	}
	
	public static void main(String[] args) {
		Leaf test = new Leaf("name", "Abdulla");
		System.out.println(test.toString());
		// TODO Auto-generated method stub

	}

}
