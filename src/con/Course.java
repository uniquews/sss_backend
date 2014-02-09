package con;

public class Course {

	//  course belongs to which requirement
	private int requirement;
	public int getRequirement() {
		return requirement;
	}
	public void setRequirement(int requirement) {
		this.requirement = requirement;
	}
	//  course belongs to which sub-requirement
	private int sub_requirement;
	public int getSub_requirement() {
		return sub_requirement;
	}
	public void setSub_requirement(int sub_requirement) {
		this.sub_requirement = sub_requirement;
	}
	//course number
	private int course_num;
	
	public int getCourse_num() {
		return course_num;
	}
	public void setCourse_num(int course_num) {
		this.course_num = course_num;
	}
	// point to next course in the same requirement and sub_requirement
	public Course right;
	// point to this course in next requirement and sub_requirement
	public Course down;
}
