import java.util.*;
import java.io.*;



public class quadrants{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));
	int n=0, b=0;
	StringTokenizer st = new StringTokenizer(in.readLine());

	n=Integer.parseInt(st.nextToken());
	b=Integer.parseInt(st.nextToken());


	int a[][]=new int[n][2];


	for(int i=0; i<n;i++){

		for(int j=0; j<2;j++){
			a[i][j]=0;
		}
	}


	for(int i=0; i<n;i++){

		st=new StringTokenizer(in.readLine());
		
		a[i][0]=Integer.parseInt(st.nextToken());
		a[i][1]=Integer.parseInt(st.nextToken());	
	
	}

	int reg1=0,reg2=0,reg3=0,reg4=0;
	int minOfMaxReg=100000;
	int maxNumOfReg=-1;


	for(int i=0; i<n;i++){ 

		int x=a[i][0]+1;

		for(int j=0; j<n;j++){ 
			int y=a[j][1]+1;

			reg1=0;
			reg2=0;
			reg3=0;
			reg4=0;

			for(int k=0; k<n;k++){ 

				if(a[k][0]>x && a[k][1]>y){
					reg1++;
				}


				if(a[k][0]>x && a[k][1]<y){
					reg4++;
				}

				if(a[k][0]<x && a[k][1]>y){
					reg2++;
				}

				if(a[k][0]<x && a[k][1]<y){
					reg3++;
				}
			}


			maxNumOfReg=Math.max(reg1,Math.max(reg2,Math.max(reg3,reg4)));

			minOfMaxReg=Math.min(minOfMaxReg,maxNumOfReg);
		}




	}


	System.out.println(minOfMaxReg);

        in.close();


    }



}
