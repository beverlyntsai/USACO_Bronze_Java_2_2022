import java.util.*;
import java.io.*;


public class calf{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int x=0, y=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	x=Integer.parseInt(st.nextToken());
	y=Integer.parseInt(st.nextToken());

	int max=Math.abs(x-y);
	int sum=0;
	int d=1;

//86 92

	while(d<max){

		sum+=2*d;//right:(2)
		System.out.println("1:"+sum);
		d=d*2;

		if(d<max){	
		
			sum+=2*d;//left:(4)
			System.out.println("2:"+sum);
			d=d*2;

		}


		if(d>max && x<y){

			//sum+=d;
			//System.out.println("3:"+sum);
			//break;
		}

	}

	if(d>max && x<y){
		sum+=max;
			System.out.println("4:"+sum);
	}

	if(d>max && x>y){
		sum+=d*2;
		sum+=max;
		System.out.println("5:"+sum);
	}

	System.out.println(sum);

        in.close();


    }



}
