package con;

import java.util.ArrayList;

public class Requirement {
	
	//requirement number
	private int req_num;
	public int getReq_num() {
		return req_num;
	}
	public void setReq_num(int req_num) {
		this.req_num = req_num;
	}
//	
//	// counting the number of sub requirement
//	private int count_sub_requirement;
//	
//
//	//relation of sub_requirement
//	private String relation;
//	public String getRelation() {
//		return relation;
//	}
//	public void setRelation(String relation) {
//		this.relation = relation;
//	}
//	
//	
//	
//	public void setSub_requirement(){
//		Sub_Requirement newSub_req = new Sub_Requirement();
//	}
//	
//	//there will be sub requirement array, store pointer to each sub requirement
//	private Sub_Requirement sub_requirment_array[];
//	
//	
//	public Sub_Requirement[] getSub_requirment_array() {
//		return sub_requirment_array;
//	}
//	public void setSub_requirment_array(Sub_Requirement sub_requirment_num) {
//		//push the new sub_requirement into the array
//		sub_requirment_array[++count_sub_requirement] = sub_requirment_num;
//		
//	}
	
	public ArrayList Create_Requirement(int target_req_num){
		//if(target_req_num > req_num){
			Sub_Requirement sub_req = new Sub_Requirement();
			sub_req.setLead_req(target_req_num);
			
			ArrayList subReq_array = new ArrayList<Sub_Requirement>();
			subReq_array.add(0, sub_req);
			return subReq_array;
		//}
		
	}
	
	
}
