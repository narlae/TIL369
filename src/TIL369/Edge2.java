package TIL369;

import java.util.ArrayList;
import java.util.Arrays;

public class Edge2 implements Comparable<Edge2> {
    public int weight;
    public String nodeV;
    public String nodeU;

    public Edge2(int weight, String nodeV, String nodeU) {
        this.weight = weight;
        this.nodeV = nodeV;
        this.nodeU = nodeU;
    }

    public String toString() {
        return "(" + this.weight + "," + this.nodeV + "," + this.nodeU + ")";
    }

    @Override
    public int compareTo(Edge2 edge2) {
        return this.weight - edge2.weight;
    }

    public static void main(String[] args) {
        ArrayList<String> vertices = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
        ArrayList<Edge2> edges = new ArrayList<Edge2>();
        edges.add(new Edge2(7, "A", "B"));
        edges.add(new Edge2(5, "A", "D"));
        edges.add(new Edge2(7, "B", "A"));
        edges.add(new Edge2(8, "B", "C"));
        edges.add(new Edge2(9, "B", "D"));
        edges.add(new Edge2(7, "B", "E"));
        edges.add(new Edge2(8, "C", "B"));
        edges.add(new Edge2(5, "C", "E"));
        edges.add(new Edge2(5, "D", "A"));
        edges.add(new Edge2(9, "D", "B"));
        edges.add(new Edge2(7, "D", "E"));
        edges.add(new Edge2(6, "D", "F"));
        edges.add(new Edge2(7, "E", "B"));
        edges.add(new Edge2(5, "E", "C"));
        edges.add(new Edge2(7, "E", "D"));
        edges.add(new Edge2(8, "E", "F"));
        edges.add(new Edge2(9, "E", "G"));
        edges.add(new Edge2(6, "F", "D"));
        edges.add(new Edge2(8, "F", "E"));
        edges.add(new Edge2(11, "F", "G"));
        edges.add(new Edge2(9, "G", "E"));
        edges.add(new Edge2(11, "G", "F"));

        System.out.println(vertices);
        System.out.println(edges);
    }
}
