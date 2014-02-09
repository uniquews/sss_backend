package com.node;

//same as ArcBox
public class ArcBox {

	public String tailCourse; //node at the tail
	public String headCourse; //node at the head
	public ArcBox tlink; //next arc with same tail
	public ArcBox hlink; //next arc with same head
	int info; //
	
	public ArcBox(){
		this.headCourse="";
		this.tailCourse="";
		this.hlink=null;
		this.tlink=null;
	}
	
	
	public ArcBox(String tail, String head, int info){ //构造函数,没有初始化指针
		this.tailCourse = tail;//
		this.headCourse = head;
		this.info = info;
		this.hlink=null;
		this.tlink=null;
		
	}
	
	public void showArcFromTail(){
		String outPut = this.tailCourse + "-->" +this.headCourse+" with " +info;
		System.out.println(outPut);
		
		return;
	}
	
	public void showArcFromHead(){
		String outPut = this.tailCourse + "-->" +this.headCourse+" with " +info;
		System.out.println(outPut);
		return;
	}
}
