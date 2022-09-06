import java.util.*;
import java.io.*;


public class working{


    public static void main(String[] args)throws Exception{


	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	int n=0, q=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	q=Integer.parseInt(st.nextToken());


	int a[]=new int[100];


	for(int i=0; i<n;i++){

		st = new StringTokenizer(in.readLine());
		
		a[i]=Integer.parseInt(st.nextToken());// only3 tasks but will takes 9 minuets

	}

	int sum=0;//sum is the total time of all tasks(in this case is 3 tasks)
	for(int i=0; i<n;i++){//Each tast spends time

		sum+=a[i]; //9

	}


	int t[]=new int[q];


	for(int i=0; i<q;i++){

		st = new StringTokenizer(in.readLine());
		
		t[i]=Integer.parseInt(st.nextToken());//record which minutes,max sum a[i]=9 minutes
	}

	int c[]=new int[sum];



	int beginning=0;
	//System.out.println("1 beginning=="+beginning);
	for(int i=0; i<n;i++){

		int end=a[i];
		end=beginning+end;
		//System.out.println("end="+end);

		for(int j=beginning; j<end;j++){

			c[j]=i+1;
		}

		beginning=end;
		//System.out.println("beginning=="+beginning);
	}


	// t only q numbers
	for(int i=0; i<q;i++){

		int timeIndex=t[i];
		System.out.println(c[timeIndex]);
	}


        in.close();


    }



}
