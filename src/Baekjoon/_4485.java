package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class NodeD implements Comparable

{
	int x;
	int y;
	int cost;
	NodeD(int y, int x, int cost){
		this.y = y; 
		this.x = x;
		this.cost = cost; 
	}
	
	public int compareTo(NodeD o) {
		return this.cost - o.cost;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class _4485 {
	static int[][] map = new int[125][125];
	static int[][] dist = new int[125][125];
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int N;
	static final int INF = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws  IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int num = 1;
		while ( true ) { 
			N = Integer.parseInt(br.readLine());
			if( N == 0 ) {
				break;
			}
			map = new int[N][N];
			dist =new int[N][N];
			for( int i = 0; i < N; i++ ) {
				st = new StringTokenizer( br.readLine(), " ");
				int idx = 0;
				while( st.hasMoreTokens() ) {
					map[i][idx] = Integer.parseInt( st.nextToken() );
					dist[i][idx] = INF;
					idx ++;
				}
			}
			int ans = solve();
			
			//System.out.println("Problem "+num+": "+ans);
			
			sb.append("Problem "+num+": "+ans+ "\n");
			num += 1;
			//printMap()
		}
		System.out.println(sb.toString());
	}
	public static int solve() {
		PriorityQueue pq = new PriorityQueue();
		dist[0][0] = map[0][0]; // 첫번쨰 dist 배열 세팅  
		pq.add(new NodeD( 0, 0, map[0][0]) ); //첫번째를 배열에 넣음
		
		while(!pq.isEmpty()) {
			NodeD n = (NodeD) pq.poll();
			int sero = n.y;
			int garo = n.x;
			int cost = n.cost;
			//꺼낼때마다  현재 보다 크다면 무시한다.
			if( dist[sero][garo] < cost) {
				continue;
			}
	
			
			
			for(int i = 0; i < 4;  i++) {
				int yy = dy[i] + sero;
				int xx = dx[i] + garo;
				if ( xx >= 0 && xx < N &&  yy >= 0  && yy < N ) {
					//yy,xx 까지 가는 길이 sero 
					if(dist[yy][xx] > dist[sero][garo] + map[yy][xx]) { //최단거리 세팅 
						dist[yy][xx] = dist[sero][garo] + map[yy][xx];
						pq.add(new NodeD(yy, xx, dist[yy][xx]));
					}
				}	
			}
		}
		return dist[N-1][N-1];
		
	}
	public static void printMap() {
		for(int i = 0 ; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(dist[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	

}
