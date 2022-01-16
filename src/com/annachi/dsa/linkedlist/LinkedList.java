package com.annachi.dsa.linkedlist;

public class LinkedList 
{
	public static Node createDummmyLinkedList(Integer size)
	{
		Node baseNode = new Node();
		baseNode.value=(int)Math.round(Math.random()*100);
		Node traverseNode = baseNode;
		for(int j=0;j<size-1;j++)
		{	
			Node node = new Node();
			node.value=(int)Math.round(Math.random()*100);
			traverseNode.node=node;
			traverseNode=node;
		}
		return baseNode;
	}
	//index starts from 1
	public static Node insertNodeAtGivenPosition(Node list,int index,int value)
	{
		Node temp = list;
		int currentIndex = 1;
		while(currentIndex<index-1 && temp!=null)
		{
			temp=temp.node;
			currentIndex++;
		}
		if(temp == null && index ==1)
		{
			Node node = new Node();
			node.value=value;
			return node;
		}
		else if(temp == null)
		{
			System.out.println("element not added, index is out of the range");
			return list;
		}
		Node node = new Node();
		node.value=value;
		Node reindexNode = temp.node;
		temp.node=node;
		node.node=reindexNode;	
		return list;
	}
	public static Node insertNode(Node list,int value)
	{
		Node temp =list;
		if(list == null)
		{
			Node node = new Node();
			node.value=value;
			return node;
		}
		while(temp.node!=null)
		{
			temp=temp.node;
		}
		Node node = new Node();
		node.value=value;
		temp.node=node;
		return list;
	}
	public static Node insertAtGivenPosition(Node list,int index,int value)
	{
		if(index == 1)
		{
			if(list == null)
			{
				Node node = new Node();
				node.value=value;
				return node;
			}
			else
			{
				Node node = new Node();
				node.value=value;
				node.node=list;
				return node;
			}			
		}
		
		Node temp = list;		
		for(int i=0;i<index-2;i++)
		{
			if(temp == null)
			{
				System.out.println("index is out of range");
				return list;
			}
			temp=temp.node;
		}
		Node nextIndex = temp.node;
		Node newNode = new Node();
		newNode.value=value;
		newNode.node=nextIndex;
		temp.node=newNode;
		return list;
	}
	public static void printLinkedList(Node list)
	{
		Node temp = list;
		while(temp!=null)
		{	
		System.out.print(temp.value+",");
		temp=temp.node;
		}
		System.out.println();
	}
	public static void main(String ...args)
	{
		Node list = createDummmyLinkedList(10);
		printLinkedList(list);
		insertAtGivenPosition(list,7,89);
		printLinkedList(list);
		insertAtGivenPosition(list,1,1);
		printLinkedList(list);
	}
}
