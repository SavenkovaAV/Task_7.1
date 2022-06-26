package ru.vsu.cs.course1.graph;

import java.util.ArrayList;
import java.util.function.Consumer;

public class FindingUnreachableVertices {
    private final Graph graph;
    private static boolean[] visited;

    public FindingUnreachableVertices(Graph graph) {
        this.graph = graph;
    }

    public static void setVisited(boolean[] visited) {
        FindingUnreachableVertices.visited = visited;
    }

    private static void dfsRec(int numberOfSpecifiedVertex, Graph graph, Consumer<Integer> visitor) {
        visited = new boolean[graph.vertexCount()];

        class Inner {
            void visit(Integer curr) {
                visitor.accept(curr);
                visited[curr] = true;
                for (Integer v : graph.adjacencies(curr)) {
                    if (!visited[v]) {
                        visit(v);
                    }
                }
            }
        }
        new Inner().visit(numberOfSpecifiedVertex);
    }

    public static ArrayList<Integer> findUnreachableVertices(Graph graph, int numberOfSpecifiedVertex, Consumer<Integer> visitor) {
        ArrayList<Integer> result = new ArrayList<>();

        dfsRec(numberOfSpecifiedVertex, graph, visitor);

        for (int i =0; i < graph.edgeCount(); i++) {
            if (visited[i] == false) {
                result.add(i);
                System.out.println(i);
            }
        }
        return result;
    }
}
