import java.io.*;
import java.util.*;

public class implementGraph {
   static class Edge {
      int source;
      int neighbour;
      int weight;

      Edge(int source, int neighbour, int weight){
         this.source = source;
         this.neighbour = neighbour;
         this.weight = weight;
      }
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter total vertex");
      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for(int i = 0; i < vtces; i++){
         graph[i] = new ArrayList<>();
      }
      System.out.println("Enter total edge");
      int edges = Integer.parseInt(br.readLine());
      System.out.println("Enter v1, v2, weight");
      for(int i = 0; i < edges; i++){
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }
        System.out.println("Enter source: ");
      int source = Integer.parseInt(br.readLine());
      System.out.println("Enter destination: ");
      int destination = Integer.parseInt(br.readLine());

    }

}