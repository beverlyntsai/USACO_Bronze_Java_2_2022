import java.util.*;
import java.io.*;


public class task{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int cowNum=0, taskNum=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	cowNum=Integer.parseInt(st.nextToken());
	taskNum=Integer.parseInt(st.nextToken());


	boolean a[]=new boolean[cowNum];


	for(int i=0; i<cowNum;i++){

			a[i]=false;

	}
	
	int startingIndex=0;
	int interval=0;

	for(int i=0; i<taskNum;i++){

		st = new StringTokenizer(in.readLine());
		
		startingIndex=Integer.parseInt(st.nextToken())-1;

		interval=Integer.parseInt(st.nextToken());	

		while(startingIndex+1<=cowNum){
			a[startingIndex]=true;//Be careful, index is not i, index is startingIndex
			startingIndex=startingIndex+interval;
		}
			

	}



	int num=0;
	for(int i=0; i<cowNum;i++){


		if(a[i]==false){
			num++;
		}
	}

	System.out.println(num);


        in.close();


    }



}
