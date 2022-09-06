import java.util.*;
import java.io.*;


public class calf{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int x=0, y=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	x=Integer.parseInt(st.nextToken());
	y=Integer.parseInt(st.nextToken());//cow position

	int sum=0;
	int dist=0;
	int curPos=0;
	boolean isFinish=false;
	boolean isCowRight=true;

	if(x<=y){
		isCowRight=true;
	}else{
		isCowRight=false;
	}

	int d=1;
	int prePos=x;

	while(!isFinish){

		curPos=x+d;

		if(isCowRight==true && curPos>=y){

			curPos=y;
			isFinish=true;
		}

		if(isCowRight==false && curPos<=y){
			curPos=y;
			isFinish=true;
		}
		
		dist=Math.abs(curPos-prePos);

		sum+=dist;

		d=d*(-2);

		prePos=curPos;
	}



	System.out.println(sum);

        in.close();


    }



}
