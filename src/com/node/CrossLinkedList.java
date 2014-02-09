package com.node;

import java.util.ArrayList;

public class CrossLinkedList {
	// store all head nodes;
	public ArrayList<Node> headNodeList = new ArrayList<Node>();

	// 默认的构造方法
	public CrossLinkedList() {
//		Node firstNode = new Node();
//		this.headNodeList.add(firstNode);
	}

	// 规定总共的课程数量构造方法  
	//give me number of courses to initialize the a list of headnode
	public CrossLinkedList(int numOf_Course) { // 
		int temp = numOf_Course;
		for (int i = 0; i < temp; i++) {
			String courseTempName = "Course " + i;
			Node node = new Node(courseTempName);
			this.headNodeList.add(node);
		}

	}

	public void addCourse(String cName) {
		String courseName = cName;
		Node node = new Node(courseName);
		this.headNodeList.add(node);
	}

	public void Display_All_Headnode() {
		System.out.print("Show all the head nodes: " + '\n');
		for (int i = 0; i < this.headNodeList.size(); i++) {
			this.headNodeList.get(i).showNode();
		}
	}

	// add a arc to the linked list
	public void setArcBox(String tail, String head, int info) {
		int size = this.headNodeList.size();
		ArcBox arc = new ArcBox(tail, head, info);

		for (int i = 0; i < size; i++) {
			//I am the tail "me--->"
			if (this.headNodeList.get(i).courseName.equalsIgnoreCase(tail)) { 
				arc.tlink = this.headNodeList.get(i).firstOut;
				this.headNodeList.get(i).firstOut = arc; // 把新的一门课加入到了图中，以arc表示
			}
			//I am the head  "--->me"
			if (this.headNodeList.get(i).courseName.equalsIgnoreCase(head)) {
				arc.hlink = this.headNodeList.get(i).firstIn;
				this.headNodeList.get(i).firstIn = arc;
			}
		}
	}

	// Display
	public void displayCrossLinkedList() {
		System.out.print("Show Cross LinkedList from tail to head: " + '\n');
		for (int i = 0; i < this.headNodeList.size(); i++) { // show head
																// linklist
			ArcBox arc = this.headNodeList.get(i).firstOut;
			while (arc != null) {
				arc.showArcFromTail();
				arc = arc.tlink;
			}
		}

		System.out.print("Show Cross LinkedList from head to tail: " + '\n');
		for (int i = 0; i < this.headNodeList.size(); i++) {
			ArcBox arc = this.headNodeList.get(i).firstIn;
			while (arc != null) {
				arc.showArcFromHead();
				arc = arc.hlink;
			}
		}

		return;
	}

//	public static void main(String args[]) {
		
//		System.out.print("The first way to create a list of course: \n");
//		//第一种构造函数初始化
//		CrossLinkedList allCourse_Relation1 = new CrossLinkedList();
//		allCourse_Relation1.addCourse("CS 109");
//		allCourse_Relation1.addCourse("CS 110");
//		allCourse_Relation1.addCourse("CS 210");
//		allCourse_Relation1.addCourse("CS 224");
//		allCourse_Relation1.addCourse("CS 300");
//		allCourse_Relation1.addCourse("CS 404");
//		allCourse_Relation1.addCourse("CS 500");
//		allCourse_Relation1.addCourse("CS 550");
//		
//		allCourse_Relation1.Display_All_Headnode();
//		
//		allCourse_Relation1.setArcBox("CS 109", "CS 110", 1);
//		allCourse_Relation1.setArcBox("CS 110", "CS 210", 1);
//		allCourse_Relation1.setArcBox("CS 110", "CS 224", 2);
//		allCourse_Relation1.setArcBox("CS 404", "CS 550", 2);
//		allCourse_Relation1.setArcBox("CS 224", "CS 300", 1);
//		allCourse_Relation1.setArcBox("CS 500", "CS 550", 1);
//		allCourse_Relation1.setArcBox("CS 109", "CS 300", 1);
//		
//		allCourse_Relation1.displayCrossLinkedList();
//		
//		System.out.print("The second way to create a list of course: \n");
//		// 第二种构造函数初始化，规定课程数量
//		CrossLinkedList allCourse_Relation2 = new CrossLinkedList(5);
//		allCourse_Relation2.Display_All_Headnode();
//
//		allCourse_Relation2.setArcBox("Course 0", "Course 2", 1);
//		allCourse_Relation2.setArcBox("Course 0", "Course 4", 1);
//		allCourse_Relation2.setArcBox("Course 2", "Course 1", 2);
//		allCourse_Relation2.setArcBox("Course 1", "Course 3", 2);
//		allCourse_Relation2.setArcBox("Course 4", "Course 3", 1);
//
//		allCourse_Relation2.displayCrossLinkedList();
		
		
		//test with DAG_example.pdf
		//use the first way to create a graph
		

//	}

}
