package TIL369;

import java.util.HashMap;

public class KruskalPath {
    HashMap<String, String> parent = new HashMap<>();
    HashMap<String, Integer> rank = new HashMap<>();

    public String find(String node) {
        // path compression 기법을 적용하면
        if (parent.get(node) != node) {
            parent.put(node, find(parent.get(node)));
        }
        return parent.get(node);
    }

    public void union(String nodeV, String nodeU) {
        String root1 = find(nodeV);
        String root2 = find(nodeU);

        //union-by-rank 기법
        if (rank.get(root1) > rank.get(root2)) {
            parent.put(root2, root1);
        }else{
            parent.put(root1, root2);
            if (rank.get(root1) == rank.get(root2)) {
                rank.put(root2, rank.get(root2) + 1);
            }
        }
    }

    public void makeSet(String node) {
        parent.put(node, node);
        rank.put(node, 0);
    }
}
