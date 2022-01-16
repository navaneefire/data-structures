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
	public static void insertNode(Node list,int value)
	{
		Node temp =list;
		while(temp.node!=null)
		{
			temp=temp.node;
		}
		Node node = new Node();
		node.value=value;
		temp.node=node;
	}
	public static void printLinkedList(Node list)
	{
		while(list!=null)
		{
			System.out.print("hashcode = "+list.hashCode()+"value = "+list.value+"\t");
			list=list.node;
		}
	}
	public static void main(String ...args)
	{
		Node list = createDummmyLinkedList(20);
		printLinkedList(list);
	}
}
