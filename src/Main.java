
public class Main {

	public static void main(String[] args) {
				
		int [][] graph ={{0,0,2,1,0,0,0},    {2,0,0,0,0,0,0}   ,{0,0,0,1,0,2,0}    ,{0,5,0,0,1,6,5}   , {0,1,0,0,0,0,0}, {0,0,0,0,0,0,10},   {0,0,0,0,3,0,0}};

		Path p = new Path();
		p.dijkstra(graph,0);
	}
		
}
