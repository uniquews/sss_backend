package com.node;

public class Course_Selection {

	public void backtrackCourse(CrossLinkedList courseRelation,
			String courseName) { // given course name
		CrossLinkedList cr = courseRelation;
		int size = cr.headNodeList.size();
		ArcBox tempArc = new ArcBox();
		Node tempNode = new Node();
		// int i = 0, j = 0; // 计数器
		for (int i = 0; i < size; i++) {
			tempNode = cr.headNodeList.get(i); // 找到这个将要被选的课程，开始回溯
			if (tempNode.courseName.equalsIgnoreCase(courseName)) {// 找到了这个课名的headnode
																	// 开始遍历链表
				tempArc = tempNode.firstIn;
				for (; tempArc != null; tempArc = tempArc.hlink) {
					int relation_type = tempArc.info;// 边的权值，代表关系
					String tempTailCourseName = tempArc.tailCourse;
					if (relation_type == 3) {
						for (int j = 0; j < size; j++) { // 这个for
							// loop只是一个找的过程，找到tempNode的第一个前驱课程，并在headnodelist中看它是否已经被选入
							Node tempNode2 = cr.headNodeList.get(j);
							if (tempNode2.courseName.equalsIgnoreCase(tempTailCourseName)) { // for
																				// loop只需要做if判断为正的时候的事情
								if (tempNode2.finished) {// 如果这个前驱课程被选入，应该看下一个前驱课程有没有被选入,回到上一层for循环
									break;
								} else if (tempNode2.finished == false
										&& tempNode2.visited == true) { // 这个前驱节点已经被mark但是它本身还没遍历完
									backtrackCourse(courseRelation,
											tempNode2.courseName);
								} else { // tempNode2.finished == false &&
											// tempNode2.visited == true
									tempNode2.visited = true; // 先把这个节点标记为mark过
									backtrackCourse(courseRelation,
											tempNode2.courseName);
								}
							}

						}
						break;
					} else {
						for (int j = 0; j < size; j++) { // 这个for
							// loop只是一个找的过程，找到tempNode的第一个前驱课程，并在headnodelist中看它是否已经被选入
							Node tempNode2 = cr.headNodeList.get(j);
							if (tempNode2.courseName
									.equalsIgnoreCase(tempTailCourseName)) { // for
																				// loop只需要做if判断为正的时候的事情
								if (tempNode2.finished) {// 如果这个前驱课程被选入，应该看下一个前驱课程有没有被选入,回到上一层for循环
									break;
								} else if (tempNode2.finished == false
										&& tempNode2.visited == true) { // 这个前驱节点已经被mark但是它本身还没遍历完
									backtrackCourse(courseRelation,
											tempNode2.courseName);
								} else { // tempNode2.finished == false &&
											// tempNode2.visited == true
									tempNode2.visited = true; // 先把这个节点标记为mark过
									backtrackCourse(courseRelation,
											tempNode2.courseName);

								}
							}

						}
					}

				}
				tempNode.finished = true; // 这个课的所有前驱finished=true;
				tempNode.visited = true;
				System.out.print(tempNode.courseName + " ");
				System.out.println();
				return;
			}
		}
		System.out.print("Cannot find selected course in headnodelist!");
		return; // 没找到这个被选的课程
	}

	// 创建graph example
	public void Create_Graph() {
		CrossLinkedList allCross_relation_example = new CrossLinkedList();
		allCross_relation_example.addCourse("CS 115");
		allCross_relation_example.addCourse("CS 334");
		allCross_relation_example.addCourse("MA 502");
		allCross_relation_example.addCourse("CS 135");
		allCross_relation_example.addCourse("CS 284");
		allCross_relation_example.addCourse("CS 181");
		allCross_relation_example.addCourse("CS 383");
		allCross_relation_example.addCourse("RED1");
		allCross_relation_example.addCourse("RED2");
		allCross_relation_example.addCourse("RED3");
		allCross_relation_example.addCourse("CS 503");
		allCross_relation_example.addCourse("CS 579");
		allCross_relation_example.addCourse("CS 548");
		allCross_relation_example.addCourse("CS 594");
		allCross_relation_example.addCourse("CS 578");

		allCross_relation_example.Display_All_Headnode();

		allCross_relation_example.setArcBox("CS 115", "CS 334", 1);
		allCross_relation_example.setArcBox("CS 115", "CS 284", 1);
		allCross_relation_example.setArcBox("CS 135", "CS 334", 1);
		allCross_relation_example.setArcBox("MA 502", "RED1", 3);
		allCross_relation_example.setArcBox("CS 135", "RED1", 3);
		allCross_relation_example.setArcBox("CS 135", "CS 284", 2);
		allCross_relation_example.setArcBox("CS 284", "RED2", 3);
		allCross_relation_example.setArcBox("CS 181", "RED2", 3);
		allCross_relation_example.setArcBox("RED2", "CS 383", 2);
		allCross_relation_example.setArcBox("RED1", "CS 503", 1);
		allCross_relation_example.setArcBox("CS 503", "CS 579", 1);
		allCross_relation_example.setArcBox("CS 594", "RED3", 3);
		allCross_relation_example.setArcBox("CS 579", "RED3", 3);
		allCross_relation_example.setArcBox("CS 548", "CS 594", 1);
		allCross_relation_example.setArcBox("RED3", "CS 578", 3);

		allCross_relation_example.displayCrossLinkedList();
		System.out.println();

		backtrackCourse(allCross_relation_example, "CS 578");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course_Selection courseSelection = new Course_Selection();
		courseSelection.Create_Graph();
	}

}
