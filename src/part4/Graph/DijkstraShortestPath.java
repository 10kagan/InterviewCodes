package part4.Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraShortestPath {
    public void computeShortestPaths(Vertex sourceVertex){
        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);
        sourceVertex.setVisited(true);

        while (!priorityQueue.isEmpty()){
            Vertex actualVertex = priorityQueue.poll();
            for (Edge edge: actualVertex.getAdjacenciesList()){
                Vertex v = edge.getTargetVertex();
                if (!v.isVisited()){
                    double newDistance = actualVertex.getDistance() + edge.getWeight();
                    if (newDistance < v.getDistance()){
                        priorityQueue.remove(v);
                        v.setDistance(newDistance);
                        v.setPredecessor(actualVertex);
                        priorityQueue.add(v);
                    }
                }
            }actualVertex.setVisited(true);
        }
    }
    public List<Vertex> getShortestPathTo(Vertex targetVertex){
        List<Vertex> path = new ArrayList<>();
        for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()){
            path.add(vertex);
        }
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");

        vertexA.addNeighbour(new Edge(10,vertexA,vertexC));
        vertexA.addNeighbour(new Edge(17,vertexA,vertexB));
        vertexC.addNeighbour(new Edge(5,vertexC,vertexB));
        vertexC.addNeighbour(new Edge(9,vertexC,vertexD));
        vertexC.addNeighbour(new Edge(11,vertexC,vertexE));
        vertexB.addNeighbour(new Edge(1,vertexB,vertexD));
        vertexD.addNeighbour(new Edge(6,vertexD,vertexE));

        DijkstraShortestPath shortestPath = new DijkstraShortestPath();
        shortestPath.computeShortestPaths(vertexA);

        System.out.println("======================================");

        System.out.println("Calculating minimum distance");
        System.out.println("======================================");

        System.out.println("Minimum distance from A to B: "+vertexB.getDistance());
        System.out.println("Minimum distance from A to C: "+vertexC.getDistance());
        System.out.println("Minimum distance from A to D: "+vertexD.getDistance());
        System.out.println("Minimum distance from A to E: "+vertexE.getDistance());

        System.out.println("=====================   =================");
        System.out.println("Calculating Paths");
        System.out.println("======================================");

        System.out.println("Shortest Path from A to B: "+shortestPath.getShortestPathTo(vertexB));
        System.out.println("Shortest Path from A to C: "+shortestPath.getShortestPathTo(vertexC));
        System.out.println("Shortest Path from A to D: "+shortestPath.getShortestPathTo(vertexD));
        System.out.println("Shortest Path from A to E: "+shortestPath.getShortestPathTo(vertexE));

    }
}


