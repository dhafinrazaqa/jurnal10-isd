import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphTraversal {
    int nodes;
    LinkedList<Integer> adjacencyList[];

    @SuppressWarnings("unchecked")
    public GraphTraversal(int vertex) {
        nodes = vertex;
        adjacencyList = new LinkedList[nodes];

        for (int i = 0; i < nodes; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void insertEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public void BFSTraversal(int start) {
        boolean visited[] = new boolean[nodes];
        Queue<Integer> BFSQueue = new LinkedList<>();
        BFSQueue.add(start);
        visited[start] = true;

        while (!BFSQueue.isEmpty()) {
            int currentVertex = BFSQueue.poll();
            System.out.print(numToAlphabet(currentVertex) + " ");
            for (int neighbor : adjacencyList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    BFSQueue.add(neighbor);
                }
            }
        }
    }

    public void DFSTraversal(int start) {
        boolean visited[] = new boolean[nodes];
        Stack<Integer> DFSStack = new Stack<>();
        DFSStack.push(start);

        while (!DFSStack.empty()) {
            int currentVertex = DFSStack.pop();

            if (!visited[currentVertex]) {
                System.out.print(numToAlphabet(currentVertex) + " ");
                visited[currentVertex] = true;

                for (int neighbor : adjacencyList[currentVertex]) {
                    if (!visited[neighbor]) {
                        DFSStack.push(neighbor);
                    }
                }
            }
        }
    }

    public String numToAlphabet(int i) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        return alphabet[i];
    }
}