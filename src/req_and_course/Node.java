package req_and_course;

//requirement link list
public class Node {

	public Node next;
	public String cName; // course name
	public boolean chosen; //be chosen or not
	
	
	public Node(String cName){
		this.cName = cName;
	}
	
	public void showNode(){
		System.out.println(cName + " " + chosen);
	}
}
