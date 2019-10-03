/*
 * Matt Jankowski
 * AI (CS 411) Hw 4
 * 15 puzzle BFS - Testing Class
 * To God be the Glory
 */

public class Testing {

    public Testing(int[] initial_board) {
        Node parent = new Node(initial_board, null, 'R');
        BFS bfs = new BFS(initial_board);
        bfs.enqueue(parent);


    }
}
