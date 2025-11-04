package com.linklist;

public class RunMainOwnLinklist {

	public static void main(String[] args) {
		
		OwnLinklList ls = new OwnLinklList();
		
		Node root = null;
		root = ls.insertListEle(10,root);
		root = ls.insertListEle(11,root);
		root = ls.insertListEle(12,root);
		root = ls.insertListEle(13,root);
		ls.printList(root);
		int count =ls.sizeList(root);
		ls.count=0;
		System.out.println(ls.sizeList(root));
		ls.count=0;
		//Node N1 = new Node
		//ls.loop(ls.sizeList(root),Node N1)
	}

}
