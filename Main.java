public class Main {
    public static void main(String[] args) {
        GraphTraversal graph = new GraphTraversal(9);

        graph.insertEdge(0, 1);
        graph.insertEdge(0, 3);
        graph.insertEdge(0, 4);
        graph.insertEdge(1, 4);
        graph.insertEdge(2, 1);
        graph.insertEdge(3, 6);
        graph.insertEdge(4, 5);
        graph.insertEdge(4, 7);
        graph.insertEdge(5, 2);
        graph.insertEdge(5, 7);
        graph.insertEdge(6, 7);
        graph.insertEdge(7, 8);
        graph.insertEdge(8, 5);

        System.out.println("Breadth First Search:");
        graph.BFSTraversal(0);
        System.out.println();

        System.out.println("Depth First Search:");
        graph.DFSTraversal(0);
        System.out.println();
    }
}
