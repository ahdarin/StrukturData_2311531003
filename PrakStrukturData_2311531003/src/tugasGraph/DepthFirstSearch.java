package tugasGraph;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch {
	private int Vertices;   // No. of vertices 
	
	// adjacency list declaration
    private LinkedList<Integer> adj_list[]; 
   
	// graph Constructor: to initialize adjacency lists as per no of vertices 
	DepthFirstSearch(int v) { 
		Vertices = v; 
		adj_list = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
			adj_list[i] = new LinkedList(); 
	} 
	
	//add an edge to the graph 
	void addEdge(int v, int w) { 
		adj_list[v].add(w);  // Add w to v's list. 
	} 
	
	// helper function for DFS technique
	void DFS_helper(int v,boolean visited[]) { 
		// current node is visited 
		visited[v] = true; 
		System.out.print(v+" "); 
		
		// process all adjacent vertices 
		Iterator<Integer> i = adj_list[v].listIterator(); 
		while (i.hasNext()) 
		{ 
			int n = i.next(); 
			if (!visited[n]) 
				DFS_helper(n, visited); 
		} 	
	} 	
	
	
	void DFS(int v) { 
		//initially none of the vertices are visited 
		boolean visited[] = new boolean[Vertices]; 
		
		// call recursive DFS_helper function for DFS technique 
		DFS_helper(v, visited); 
	} 
}