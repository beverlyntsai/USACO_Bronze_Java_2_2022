import java.util.*;
import java.io.*;



public class cowcover{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int x[]=new int[n];
	int y[]=new int[n];
	int X_min=100000; int X_max=-1;int Y_min=100000;int Y_max=-1;
	int exclude[]=new int[4];//record index of X_min, X_max,Y_min,Y_max;
	int minArea=40000*40000;


	for(int i=0; i<n;i++){
		st = new StringTokenizer(in.readLine());

		x[i]=Integer.parseInt(st.nextToken());
		y[i]=Integer.parseInt(st.nextToken());

	}


	//find X_min, X_max,Y_min,Y_max;
	for(int i=0; i<n;i++){

		if(x[i]<X_min){
			X_min=x[i];
			exclude[0]=i;
		}

		if(x[i]>X_max){
			X_max=x[i];
			exclude[1]=i;
		}

		if(y[i]<Y_min){
			Y_min=y[i];
			exclude[2]=i;
		}

		if(y[i]>Y_max){
			Y_max=y[i];
			exclude[3]=i;
		}

	}

	//exclude one point and to calculate other area by using 4 points
	for(int i=0; i<4;i++){

 		X_min=100000; X_max=-1;Y_min=100000;Y_max=-1;
		for(int j=0; j<n;j++){

			if(exclude[i]!=j){

				X_min=Math.min(X_min,x[j]);
				X_max=Math.max(X_max,x[j]);
				Y_min=Math.min(Y_min,y[j]);
				Y_max=Math.max(Y_max,y[j]);
			}

		}

		int area=(X_max-X_min)*(Y_max-Y_min);

		minArea=Math.min(area,minArea);
	}



	System.out.println(minArea);




        in.close();


    }



}
