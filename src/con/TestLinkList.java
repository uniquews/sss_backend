package con;

import java.util.ArrayList;

public class TestLinkList {

	public ArrayList<Linklist> course_list = new ArrayList<Linklist>(); //requirement list
	public ArrayList<Course_LinkList> course_list2 = new ArrayList<Course_LinkList>(); //course list
 
	public void addReq2List(Linklist linklist) {
		this.course_list.add(linklist);
	}

	public void displayReqList() {

		for (int i = 0; i < course_list.size(); i++) {
			course_list.get(i).displayAllNodes();
		}
	}

	public void addReq2List(Course_LinkList course_linklist) {
		this.course_list2.add(course_linklist);
	}

	public void displayCourseList() {

		for (int i = 0; i < course_list2.size(); i++) {
			course_list2.get(i).displayAllNodes();
		}
	}

	// choose a course in a requirement link list
	// First, we need to find this course in a specific requirement. Given a
	// requirement and a course,
	// we need to find them first and than choose them.
	public boolean checkCourseIn_ReqList(String reqName, String courseName) {
		boolean ifFind = false;
		boolean ifChosen = false;
	
		int i =0; //记录requirement的index
		int j = 0; //记录课程链表的index，第几个课程链表，找到后直接修改/判断头结点
		for (; i < course_list.size(); i++) {
			
			ifFind = this.course_list.get(i).chooseCourse(reqName, courseName);
			if (ifFind) {
				break;
			}
		}
		if(!ifFind)
			return false;
		
		//int size = this.course_list2.size();  课程列表大小
		for (; j < this.course_list2.size(); j++) {
			if(this.course_list2.get(j).first.rName == courseName){
				ifChosen = this.course_list2.get(j).checkChosen();
				
				if (ifChosen) {
					return false; // this course has been chosen, so it cannot be chosen again.
				}
				break;
			}
			
		}
		//选课
		this.course_list.get(i).set2ChooseCourse(courseName); //在requirement链表中标记
		this.course_list2.get(j).set_course_be_chosen(); //在课程表链表中标记
		
		return true; // this course exists and has not been chosen.
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean chooeseSuccess =false;//是否选课成功
		TestLinkList list = new TestLinkList();// set

		Linklist linkList1 = new Linklist();// requirement 链表
		linkList1.addFirstNode("Requirement_1");

		linkList1.insertNode(1, "CS105");
		linkList1.insertNode(2, "CS108");
		linkList1.insertNode(3, "CS109");
		// linkList1.displayAllNodes();
		// linkList.deleteByData(99);
		// System.out.println("After deleting:");
		// linkList.displayAllNodes();

		Linklist linkList2 = new Linklist();
		linkList2.addFirstNode("Requirement_2");

		linkList2.insertNode(1, "CS135");
		linkList2.insertNode(1, "CS105");
		linkList2.insertNode(1, "CS455");

		Linklist linkList3 = new Linklist();
		linkList3.addFirstNode("Requirement_3");
		linkList3.insertNode(1, "CS105");
		linkList3.insertNode(1, "CS135");
		linkList3.insertNode(1, "CS404");
		linkList3.insertNode(1, "CS455");

		Linklist linkList4 = new Linklist();
		linkList4.addFirstNode("Requirement_4");
		linkList4.insertNode(1, "CS500");
		linkList4.insertNode(1, "CS404");
		linkList4.insertNode(1, "CS455");

		list.course_list.add(linkList1);
		list.course_list.add(linkList2);
		list.course_list.add(linkList3);
		list.course_list.add(linkList4);
		
		int size = list.course_list.size();
		System.out.print("Size is: "+size);
		System.out.println();

		list.displayReqList();//显示requirement list

		Course_LinkList cLink_list = new Course_LinkList();// 课程链表
		cLink_list.addFirstNode("CS105");
		cLink_list.insertNode(1, "Requirement_1");
		cLink_list.insertNode(1, "Requirement_2");
		cLink_list.insertNode(1, "Requirement_3");

		Course_LinkList cLink_list2 = new Course_LinkList();// each link list
		cLink_list2.addFirstNode("CS108");
		cLink_list2.insertNode(1, "Requirement_1");

		Course_LinkList cLink_list3 = new Course_LinkList();// each link list
		cLink_list3.addFirstNode("CS109");
		cLink_list3.insertNode(1, "Requirement_1");

		Course_LinkList cLink_list4 = new Course_LinkList();// each link list
		cLink_list4.addFirstNode("CS135");
		cLink_list4.insertNode(1, "Requirement_2");
		cLink_list4.insertNode(1, "Requirement_3");

		Course_LinkList cLink_list5 = new Course_LinkList();// each link list
		cLink_list5.addFirstNode("CS404");

		cLink_list5.insertNode(1, "Requirement_3");
		cLink_list5.insertNode(1, "Requirement_4");

		Course_LinkList cLink_list6 = new Course_LinkList();// each link list
		cLink_list6.addFirstNode("CS455");
		cLink_list6.insertNode(1, "Requirement_2");
		cLink_list6.insertNode(1, "Requirement_3");
		cLink_list6.insertNode(1, "Requirement_4");

		list.course_list2.add(cLink_list);
		list.course_list2.add(cLink_list2);
		list.course_list2.add(cLink_list3);
		list.course_list2.add(cLink_list4);
		list.course_list2.add(cLink_list5);
		list.course_list2.add(cLink_list6);
		list.displayCourseList();//显示course list
		
		//开始选课
		chooeseSuccess = list.checkCourseIn_ReqList("Requirement_1", "CS109");
		if(chooeseSuccess){
			list.displayReqList();//显示requirement list
			list.displayCourseList();//显示course list
		}else
		{
			System.out.print("failed");
		}
		
	}

}
