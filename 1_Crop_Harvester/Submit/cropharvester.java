import java.util.*;
import java.io.*;

/*
SAMPLE INPUT

-3 2 8 5
2 4 9 10
SAMPLE OUTPUT

33
*/

public class cropharvester{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	StringTokenizer st = new StringTokenizer(in.readLine());

	int rx1=Integer.parseInt(st.nextToken());//left bottom
	int ry1=Integer.parseInt(st.nextToken());//left bottom
	int rx2=Integer.parseInt(st.nextToken());//right top
	int ry2=Integer.parseInt(st.nextToken());//right top

	//System.out.println("RX="+rx1+", RY="+ry1);
	//System.out.println("RX="+rx2+", RY="+ry2);

	st = new StringTokenizer(in.readLine());

	int gx1=Integer.parseInt(st.nextToken());//left bottom
	int gy1=Integer.parseInt(st.nextToken());//left bottom	
	int gx2=Integer.parseInt(st.nextToken());//right top
	int gy2=Integer.parseInt(st.nextToken());//right top

	//System.out.println("GX="+gx1+", GY="+gy1);
	//System.out.println("GX="+gx2+", GY="+gy2);


	//Track how many red area vertext inside green area
	//(1) counter=0, answer=red area
	//(2) counter=1, answer=red area
	//(3) counter=4, ansewr=0 (means it's benn completed harvest)
	//(4) counter=2, answer=red area-intersection Area =>Do not use matrix

	int counter=0;
	boolean TRcorner=false, BRcorner=false, TLcorner=false, BLcorner=false;//Red area 4 vertex
	if(gx1<rx2 && rx2<gx2 && gy1<ry2 && ry2<gy2){
		TRcorner=true;
		counter++;
	}

	if(gx1<rx2 && rx2<gx2 && gy1<ry1 && ry1<gy2){
		BRcorner=true;
		counter++;
	}

	if(gx1<rx1 && rx1<gx2 && gy1<ry2 && ry2<gy2){
		TLcorner=true;
		counter++;
	}

	if(gx1<rx1 && rx1<gx2 && gy1<ry1 && ry1<gy2){
		BLcorner=true;
		counter++;
	}

	//System.out.println("counter="+counter);

	int answer=0;//is the red area

	//count red area
	if(counter ==0 || counter==1){

		answer=(rx2-rx1)*(ry2-ry1); //red area

	}else if(counter ==3 || counter==4){

		answer=0; //means every area has been harvest

	}else{//counter=2
		
		if(TRcorner==true && TLcorner==true){
			answer=(gy1-ry1)*(rx2-rx1);
		}

		if(TRcorner==true && BRcorner==true){
			answer=(gx1-rx1)*(ry2-ry1);
		}

		if(BRcorner==true && BLcorner==true){
			answer=(ry2-gy2)*(rx2-rx1);
		}

		if(TLcorner==true && BLcorner==true){
			answer=(ry2-ry1)*(rx2-gx2);
		}
	}

	System.out.println(answer);

        in.close();


    }



}
