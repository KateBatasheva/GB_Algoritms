package lesson7;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Graph graph = new Graph(5);
//        graph.addEdge(1,2);
//        graph.addEdge(0,4);
//        graph.addEdge(1,4);
//        graph.addEdge(1,0);

//        System.out.println(graph.getAdjList(1));

//        DepthFirstPaths dfp = new DepthFirstPaths(graph, 2);
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));

//
//        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 2);
//        System.out.println(bfp.hasPathTo(0));
//        System.out.println(bfp.pathTo(0));
        Random random = new Random();
        Graph graph = new Graph(10);
        ArrayList list = new ArrayList();
        for (int i = 0; i < graph.getVertexCount(); i++) {
            int x;
            int y;
            do {
                x = random.nextInt(10);
                y = random.nextInt(10);
            } while (x == y);
            list.add(x);
            list.add(y);
            System.out.println(y + " - " + x);
            graph.addEdge(y, x);
        }


        for (int i = 0; i < graph.getVertexCount() - 1; i++) {
            BreadthFirstPaths bfp = new BreadthFirstPaths(graph, i);
            for (int j = i + 1; j < graph.getVertexCount(); j++) {
                if (!list.contains(i) || !list.contains(j)){
                continue;
            }
            if (!bfp.hasPathTo(j)) {
                System.out.println("Кратчайший путь между вершинами " + i + " и " + j + " не существует");
                continue;
            }
            System.out.println("Кратчайший путь между вершинами " + i + " и " + j + " - " + bfp.pathTo(j));
        }

    }
}
}
