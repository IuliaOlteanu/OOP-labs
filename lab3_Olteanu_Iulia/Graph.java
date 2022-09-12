import java.util.Arrays;

public class Graph {
    private int [][]matrice;
    private static final int Infinit = 9500;
    private int n;

    public Graph(int n) {
        this.n = n;
        matrice = new int[n+1][n+1];
        for(int i = 1; i <= n; i++)
            matrice[i] = new int[n+1];
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= n; j++)
                matrice[i][j] = Infinit;
    }

    public int getSize() {
        return n;
    }

    public void addArc(int v, int w, int cost) {
        matrice[v][w]=cost;
    }

    public boolean isArc(int v, int w) {
        if(matrice[v][w] != Infinit)
            return true;
        else
            return false;
    }

    public String toString() {
        int i,j;
        StringBuffer sir = new StringBuffer();
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n; j++) {
                if(isArc(i,j))
                    sir.append(matrice[i][j]+" ");
                else
                    sir.append("* ");
            }
            sir.append("\n");
        }
        return sir.toString();
    }

    public int[][] floydWarshall() {
        int result[][];
        result = new int[n+1][n+1];
        int k, i, j;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n; j++) {
                if(i == j) {
                    result[i][j] = 0;
                } else if(isArc(i, j)) {
                    result[i][j] = matrice[i][j];
                } else {
                    result[i][j] = Infinit;
                }
            }
        }
        for(k = 1; k <= n; k++) {
            for(i = 1; i <= n; i++) {
                for(j = 1; j <= n; j++) {
                    int dist;
                    dist = result[i][k] + result[k][j];
                    if(result[i][j] > dist) {
                        result[i][j] = dist;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Graph g = new Graph(8);

        System.out.println(g.getSize());
        g.addArc(1,7,15);
        g.addArc(1,5,1);
        g.addArc(5,7,2);

        g.addArc(6,1,6);
        g.addArc(5,6,3);
        g.addArc(4,5,2);

        g.addArc(8,5,2);
        g.addArc(8,6,4);
        g.addArc(3,6,7);

        g.addArc(6,2,1);
        g.addArc(2,3,5);
        g.addArc(3,4,6);

        System.out.println(g);
        System.out.println("Floyd-Warshall");
        int [][] my_matrix = g.floydWarshall();
        System.out.println("distanta minima dintre nodurile 6 si 5 este "+ my_matrix[6][5]); // rezultat - 9*/
    }

}
