package TIL369;

import java.util.PriorityQueue;

public class Edge implements Comparable<Edge>{
    public int distance;
    public String vertex;

    public Edge(int distance, String vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }

    @Override
    public String toString() {
        return "vertex: " + this.vertex + ", distance: " + this.distance;
    }

    @Override
    public int compareTo(Edge edge) {
        return this.distance - edge.distance;
    }

    public static void main(String[] args) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<Edge>();
        priorityQueue.add(new Edge(2, "A"));
        priorityQueue.add(new Edge(5, "B"));
        priorityQueue.add(new Edge(1, "C"));
        priorityQueue.add(new Edge(7, "D"));

        System.out.println(priorityQueue.peek());
        Edge edge = priorityQueue.poll();
        System.out.println(edge);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.size());

    }
}


