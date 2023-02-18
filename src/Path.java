
public class Path {

	public int distance(int dist[], Boolean bool[])
	{
		int minimum = Integer.MAX_VALUE , index = -1;
		for(int z=0 ; z<7; z++) {
			if(bool[z] == false && dist[z] <= minimum)
			{
				minimum = dist[z];
				index = z ;
			
			}
		}
		return index ;
	}
	
	
	
	public void dijkstra(int graph[][] , int num) 
	{
		int dist[] = new int[7];
		Boolean bool[]= new Boolean[7];
		

		for (int i = 0 ; i<7 ; i++) 
		{
			dist[i] = Integer.MAX_VALUE;
			bool[i] = false;
		}
		
		dist[num]=0;
		for (int j =0; j < 7 ; j++)
		{
			int k = distance(dist,bool);
			bool[k] = true;
			for (int x =0; x < 7 ; x++)
			{
				if(!bool[x]&& graph[k][x]!=0 && dist[k]!= Integer.MAX_VALUE && dist[k]+ graph[k][x] < dist[x] )
						{
							dist[x] = dist[k] + graph [k][x];
						}
			
			}
			print(dist,7);
		}
		
	}
	
	public void print(int dist[], int x ) 
	{
		System.out.println("Distance");
		for(int i =0; i<7 ; i++)
		{
			System.out.println(i + "  :"+ dist[i]);
		}
	}
	
	
	
		
}
	
	
	
