package com.node;

//same as ArcBox
public class ArcBox {

	public String tailCourse; //node at the tail
	public String headCourse; //node at the head
	public ArcBox tlink; //next arc with same tail
	public ArcBox hlink; //next arc with same head
	int info; //
	
	
	public ArcBox(String tail, String head, int info){
		this.tailCourse = tail;
		this.headCourse = head;
		this.info = info;
		
	}
	
	public void showArcFromTail2Head(){
		
		String outPut = this.tailCourse + "-->" +this.headCourse+"with" +info;
		System.out.println(outPut);
		
		return;
	}
	
	public void showArcFromHead2Tail(){
		String outPut = this.headCourse + "-->" +this.tailCourse+"with" +info;
		System.out.println(outPut);
		return;
	}
}
