
import java.util.*;

class BFS
{
    private int V;                  
    private LinkedList<Integer> adj[];  
    private Queue<Integer> queue;       
 
    BFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }
 
    void addEdge(int v,int w)
    {
        adj[v].add(w);                         
    }
 
    void BFS1(int n)
    {

        boolean nodes[] = new boolean[V];       
        int a = 0;
 
        nodes[n]=true;                  
        queue.add(n);       
 
        while (queue.size() != 0)
        {
            n = queue.poll();            
            System.out.print(n+" ");          
            for (int i = 0; i < adj[n].size(); i++)  
            {
                a = adj[n].get(i);
                if (!nodes[a])               
                {
                    nodes[a] = true;
                    queue.add(a);
                }
            }  
        }
    }

    public static void main(String args[])
    {
        BFS g = new BFS(6);
 
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(0, 4);
        g.addEdge(4, 5);
        g.addEdge(3, 5);
        g.addEdge(1, 2);
        g.addEdge(1, 0);
        g.addEdge(2, 1);
        g.addEdge(4, 1);
        g.addEdge(3, 1);
        g.addEdge(5, 4);
        g.addEdge(5, 3);
 
        System.out.println("The Breadth First Traversal is:");
 
        g.BFS1(0);
    }
}
