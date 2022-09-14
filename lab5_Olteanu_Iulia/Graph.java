import java.util.Arrays;

public class Graph extends MyList {
    int n;
    boolean viz[];
    MyList l = new MyList();
    Graph(int n) {

        this.n = n;
        this.viz = new boolean[n+1];
        int i;
        for(i = 0; i < n; i++)
            this.add(new MyList());
    }
    void add(int x, int y) {
        MyList l = (MyList) this.get(x);
        l.add(y);
    }
    void dfs(int start) {
        viz[start] = true;
        System.out.print(start + " ");

        int j = 0;
        MyList l = (MyList) this.get(start);

        if(l == null) {
            return;
        }
        while (l.get(j) != null) {
            Object node = l.get(j);
            if(!viz[(int)node]) {
                dfs((int) node);
            }
            j++;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < n; i++) {
            MyList l = (MyList) this.get(i);
            s.append(i);
            s.append(": ");
            s.append(l.toString());
            s.append('\n');
        }
        return s.toString();
    }
}
