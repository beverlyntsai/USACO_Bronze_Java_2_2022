import java.util.*;
import java.io.*;


public class HGS{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int a[][]=new int[4][4];


	for(int i=0; i<4;i++){

		for(int j=0; j<4;j++){
			a[i][j]=0;
		}
	}

	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());

		int p1=Integer.parseInt(st.nextToken());
		int p2=Integer.parseInt(st.nextToken());

		a[p1][p2]++;
	}

	//Case 1: H:1 S:2 G:3  1>2>3>1
	//Case 2: H:1 S:3 G:2  1>3>2>1

	int ans1=0, ans2=0;
	ans1=a[1][2]+a[2][3]+a[3][1];
	ans2=a[1][3]+a[3][2]+a[2][1];

	int answer=Math.max(ans1,ans2);

	System.out.println(answer);




        in.close();


    }



}
