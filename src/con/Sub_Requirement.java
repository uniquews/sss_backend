package con;

public class Sub_Requirement {
	
	// belogs to which requirement;
	private int lead_req;	
	
	public int getLead_req() {
		return lead_req;
	}
	public void setLead_req(int lead_req) {
		this.lead_req = lead_req;
	}


	//sub_requirenment number
	private int sub_num;
	
	public int getSub_num() {
		return sub_num;
	}
	public void setSub_num(int sub_num) {
		this.sub_num = sub_num;
	}
	
	
	private Course course_node;
	public Course getCourse_node() {
		return course_node;
	}
	public void setCourse_node(Course course_node) {
		this.course_node = course_node;
	} 
	
	private int total_num_sub_req;

	public int getTotal_num_sub_req() {
		return total_num_sub_req;
	}
	public void setTotal_num_sub_req(int total_num_sub_req) {
		this.total_num_sub_req = total_num_sub_req;
	}

}
