package com.guru;
/*
Shipment Bundling
We are in the truck freight brokerage business, finding Independent trucks to serve our customers'hauling requests. One problem that truckers face is having to find work that minimizes the numberof miles they drive empty (aka deadheading ). Empty miles add to fuel costs, and are anopportunity cost - they could be driving that same distance hauling freight.
We wants to help by automatically bundling shipments that we offer to truck drivers. This wouldmake getting work from us easier than getting work from multiple sources, and ensure drivers makemore money when working with us.
We'd like you to implement a V1 shipment bundler.
HH Spec for V1
Given a file with a single week's worth of shipments (Monday through Friday), find the fewestnumber of bundles to offer to carriers.
A shipment bundle is a chronologically ordered sequence of shipments, where each shipment's"SMART CITY is the same as the previous one's END CITY, and their days are sequential andconsecutive leg. 'M-T-W is okay, M-F is not). Every shipment should be in exactly one bundle, andbundles of one shipment are okay. In the case of a tie (multiple optimal solutions of N bundles), anysolution is acceptable.
Your program should take the form of
<run command> input file name>
HAN Input fileEach line in the file represents one shipment, and looks like:
<SHIPMENT_ID> <START TO> <END CITY> <DAY_OF_WEEK>
SHIPMENT IDs are integers, cities are single words (e.g. SAN FRANCISCO"), and the days of theweek are
M MondayT-TuesdayW-WednesdayR-ThursdayF- FridayShipment Bundling


Output (stdout)The output of your program should be to stdout Each line represents one shipment bundle as aseries of shipment IDs, each separated by a space. The shipments in each bundle should be orderedchronologically, earliest to latest. The order of the lines in the file does not matter
w Example
Here is a sample Input file of 6 shipments:
1 SEATTLE PORTLAND M2 PORTLAND SAN FRANCISCO3 PORTLAND DENVER22 SEATTLE DENVER R44 DENVER SEATTLE W99 DENVER KANSAS CITY F
And here is a sample output file for Input which bundles the shipments into 2 bodies:
3 44 22 991 2
1 3 44 22 992 
You can see that1. Every shipment is in exactly one bundle.2. Shipments within a bundle are ordered chronologically.3. Shipments within a bundle pick up at the place the previous one left off.4. There are no gaps in the days between shipments.
## What to submit
Please make sure you include all the following in your submission:
1. Program source code2. A set of test files that you use to validate your solution3. Any instructions on how to build/run your program andyour tests
Hope to see you at DP World

*/
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
