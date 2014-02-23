package req_and_course;

public class CourseNode {  //

	public String rName;
	public CourseNode next;
	public boolean beChosen; //stored in the head node

	public CourseNode(String rName) {
		this.rName = rName;
	}

	public void showNode() {
		System.out.println(rName + " ");
	}
	public void showFirstNode(){
		System.out.print(rName + " " + beChosen +'\n');
	}

}
