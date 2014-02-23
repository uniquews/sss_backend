package com.node;

import java.util.ArrayList;

public class CrossLinkedList {
	//store all head nodes;
	public ArrayList<Node> headNodeList = new ArrayList<Node>();
	
	public CrossLinkedList(int numOf_Course){ //give me number of courses to initialize the a list of head node
		int temp  = numOf_Course;
		for(int i = 0; i<temp;i++){
			String courseTempName= "Course " + i;
			Node node = new Node(courseTempName);
			this.headNodeList.add(node);
		}
		
	}
	
	
	//add a arc to the linked list
	public void setArcBox(String tail, String head, int info){
		int size = this.headNodeList.size();
		int i = 0;
		for(;i<size;i++){
			if(this.headNodeList.get(i).courseName == tail){ // I am the tail  "me---->"
				Node tempNode = this.headNodeList.get(i);
				
				
				ArcBox arc = new ArcBox(tail, head, info);
				arc.tlink = tempNode.firstOut;
				tempNode.firstOut = arc;
				
			}
			if(this.headNodeList.get(i).courseName == head){
				Node tempNode = this.headNodeList.get(i);
				ArcBox arc = new ArcBox(tail, head, info);
				arc.hlink = tempNode.firstIn;
				tempNode.firstIn = arc;
				
			}
			
		}
		
	}
	
	//Display
	public void displayCrossLinkedList(){
		System.out.print("Show Cross LinkedList from tail to head: ");
		for(int i = 0; i< this.headNodeList.size(); i++){
			Node tempNode = this.headNodeList.get(i);
			ArcBox tempArc = tempNode.firstOut;
			
			
			tempNode.firstOut.showArcFromTail2Head();
		}
		
		System.out.print("Show Cross LinkedList from head to tail: ");
		for(int i = 0; i< this.headNodeList.size(); i++){
			Node tempNode = this.headNodeList.get(i);
			tempNode.firstIn.showArcFromTail2Head();
			
		}
		return;
	}
	
	
	

}
