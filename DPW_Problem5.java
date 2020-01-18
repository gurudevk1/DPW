package com.guru;

import java.io.*;
import java.util.*;

public class DPW_Problem5 {
	
	//We will use BFS approch to solve this question 
	class Node{
		String s;
		String e;
		String shId;
		int day;
		Node(String st,String ed,String sId,int d){
			s=st;
			e=ed;
			shId=sId;
			day=d;
		}
		
		@Override
		public boolean equals(Object obj) {
			return super.equals(obj);
		}
	}
	class Graph{ 
	    private int V;   
	    private LinkedList<LinkedList<Node>> adj; 
	  
	    Graph(int v) 
	    { 
	        V = v;
	        for (int i=0; i<v; ++i) 
	            adj.get(i).addAll(new LinkedList<Node>()); 
	    } 
	  
	    // Function to add an edge into the graph 
	    void addEdge(Node v,Node w) 
	    { 
	     
	    }
	    void BFS(int s) 
	    { 
	        // Mark all the vertices as not visited(By default 
	        // set as false) 
	        boolean visited[] = new boolean[V]; 
	  
	        // Create a queue for BFS 
	        LinkedList<Integer> queue = new LinkedList<Integer>(); 
	  
	        // Mark the current node as visited and enqueue it 
	        visited[s]=true; 
	        queue.add(s); 
	  
	        while (queue.size() != 0) 
	        { 
	            // Dequeue a vertex from queue and print it 
	            s = queue.poll(); 
	            System.out.print(s+" "); 
	  
	            // Get all adjacent vertices of the dequeued vertex s 
	            // If a adjacent has not been visited, then mark it 
	            // visited and enqueue it 
	            Iterator<Integer> i=null;  //adj.get().listIterator(); 
	            while (i.hasNext()) 
	            { 
	                int n = i.next(); 
	                if (!visited[n]) 
	                { 
	                    visited[n] = true; 
	                    queue.add(n); 
	                } 
	            } 
	        } 
	    } 
	}
	
	public static void main(String[] args) {
//		 File file = new File("C:\\Users\\gurukuma\\Desktop\\test.txt"); 
//		 BufferedReader br;
//		try {
//			br = new BufferedReader(new FileReader(file));
//			String st; 
//			String[] r;
//			 try {
////				while ((st = br.readLine()) != null) {
////					
////				}
//				 st = br.readLine();
//				    
//			} catch (IOException e) {
//			} 
//		} catch (FileNotFoundException e) {
//		} 
		
		
		
	}
	
}
