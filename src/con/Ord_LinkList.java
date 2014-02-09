package con;

import java.util.ArrayList;

public class Ord_LinkList {
	public Requirement req;
	public Ord_LinkList(int req_num, String relation){
		
		this.req.setReq_num(req_num);
		//this.req.setSub_req(sub_req_num);
		
		int requirement = req.getReq_num();
		ArrayList sub_requirement = new ArrayList<Sub_Requirement>();
		sub_requirement = req.Create_Requirement(req_num);
		Sub_Requirement sub1 = (Sub_Requirement) sub_requirement.get(0);

		
		
	}

}
