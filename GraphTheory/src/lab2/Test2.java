package lab2;

import graph.AGraph;
import graph.UndirectedGraph;

public class Test2 {
	public static void main(String[] args) {
		UndirectedGraph a1 = new UndirectedGraph(8);
//		a1.addEdge(1, 2);
//		a1.addEdge(1, 3);
//		a1.addEdge(2, 4);
//		a1.addEdge(2, 5);
//		a1.addEdge(3, 7);
//		a1.addEdge(7, 6);
//		a1.printAdjMatrix();
//		a1.BFS(1);
//		a1.DFS(1);
		
		a1.addEdge(0, 1);
		a1.addEdge(0, 3);
		a1.addEdge(0, 4);
		a1.addEdge(1, 2);
		a1.addEdge(1, 3);
		a1.addEdge(1, 4);
		a1.addEdge(1, 5);
		a1.addEdge(2, 5);
		a1.addEdge(2, 7);
		a1.addEdge(3, 4);
		a1.addEdge(3, 4);
		a1.addEdge(3, 4);
		a1.addEdge(3, 5);
		a1.addEdge(3, 7);
		a1.addEdge(5, 7);
		a1.addEdge(6, 7);
		a1.printAdjMatrix();
		a1.BFS(5);
		a1.DFS(2);
		System.out.println("is Simple graph : " + a1.isSimpleGraph());
		System.out.println("Is Connected Graph : " + a1.isConnectedGraph());
		System.out.println("Is Barpitite Graph : " + a1.isBipartiteGraph());
		System.out.println("Path from 5 - 2 exists : " + a1.hasPath(5, 2));
		System.out.println("Number of smaller connected graph : " + a1.numOfConnectedSubgraph());
		System.out.println("----------------------------------------------");
//		AGraph a2 = new UndirectedGraph(11);
//		a2.addEdge(0, 1);
//		a2.addEdge(0, 3);
//		a2.addEdge(0, 4);
//		a2.addEdge(1, 2);
//		a2.addEdge(1, 3);
//		a2.addEdge(1, 4);
//		a2.addEdge(1, 5);
//		a2.addEdge(2, 5);
//		a2.addEdge(2, 7);
//		a2.addEdge(3, 4);
//		a2.addEdge(3, 4);
//		a2.addEdge(3, 4);
//		a2.addEdge(3, 5);
//		a2.addEdge(3, 7);
//		a2.addEdge(5, 7);
//		a2.addEdge(6, 7);
//		a2.addEdge(8, 9);
//		a2.addEdge(8, 10);
//		a2.addEdge(9, 10);
//		a2.printAdjMatrix();
//		a2.BFS(5);
//		a2.BFS(10);
//		System.out.println("is Simple graph : " + a2.isSimpleGraph());
//		System.out.println("Is Connected Graph : " + a2.isConnectedGraph());
//		System.out.println("Path from 2 - 4 exists : " + a2.hasPath(2, 4));
//		System.out.println("Path from 5 - 8 exists : " + a2.hasPath(5, 8));
//		System.out.println("Number of smaller connected graph : " + a2.numOfConnectedSubgraph());
		
//		UndirectedGraph u = new UndirectedGraph(5);
//		u.addEdge(0, 1);
//		u.addEdge(0, 2);
//		u.addEdge(0, 3);
////		u.addEdge(1, 2);
//		u.addEdge(4, 1);
//		u.addEdge(4, 2);
//		u.addEdge(4, 3);
//		u.printAdjMatrix();
//		System.out.println(u.isBipartiteGraph());
	}
}
