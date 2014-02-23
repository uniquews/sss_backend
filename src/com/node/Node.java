package com.node;


//same as VexNode
public class Node {
	
	public String courseName;
	public ArcBox firstIn, firstOut;
	
	public Node(String courseName){
		this.courseName = courseName;
		this.firstIn = null; // pointing to the first node coming in to this head node
		this.firstOut = null;  //pointing to the first node coming out from this head node
	}
	
	
	public void showNode(){
		System.out.println(courseName + " ");
	}
	
	
}
