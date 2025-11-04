package com.linklist;

public class OwnLinklList {
	
	public Node insertListEle(int i,Node node)
	{
		if(node == null)
		{
			return getNode(i,node);
		}else
		{
			return AddNode(i,node);
		}
	}
	
	public Node AddNode(int i,Node node)
	{
		Node n1 = new Node();
		n1.setI(i);
		n1.setNext(node);
		return n1;
	}
	
	public Node getNode(int i , Node node)
	{
		Node root = new Node();
		root.setI(i);
		root.setNext(node);
		return root;
	}
	
	public void printList(Node node)
	{
		if(node!=null)
		{
			System.out.print(node.getI()+" ");
			printList(node.getNext());
		}
		
	}
	

	
	int count=0;
	public int sizeList(Node node)
	{
		int retCount=0;
		if(node!=null)
		{
			count++;
			sizeList(node.getNext());
			retCount = count;
		}
		return retCount;
		
	}
	
	public void TrivasalNode(Node node,int data,int intialData)
	{
		if(node!=null)
		{
			if(intialData!=data)
			{
				System.out.print(node.getI()+" ");
				TrivasalNode(node.getNext(),node.getI(),intialData);
			}
			
		}
		
	}
	
	public Node retNode(Node n1)
	{
		Node n2 =null;
		if(n1!=null)
		{
			n2=n1.getNext();
		}
		return n2;
	}
	
	public void loop(int count,Node N1)
	{
		OwnLinklList ls = new OwnLinklList();
		Node roottemp = null;
		roottemp = ls.insertListEle(10,roottemp);
		for(int i=0;i<=count;i++)
		{
			Node n = retNode(N1);
			roottemp = ls.insertListEle(n.getI(),n);
			System.out.println("New LL ");
			System.out.print(n.getI()+" ");
			N1 =n;
		}
	}
	

}
