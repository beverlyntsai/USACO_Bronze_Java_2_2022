import java.util.*;
import java.io.*;

public class play{

    public static void main(String[] args)throws Exception{

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	int n = Integer.parseInt(in.readLine());
	StringTokenizer st;

	int a[]=new int[n];

	st = new StringTokenizer(in.readLine());
	for(int i=0; i<n;i++){
		a[i]=Integer.parseInt(st.nextToken());
	}

	int counter=-1;
	int index=n-1;	
	boolean isNotMatch=false;
	a[0]=0;

	while(index>0){

		if(counter==-1 && a[index]>0){
			counter=a[index];
			counter--;//counter=1
		}else{

			if(counter>=0){
				if(a[index]==-1){			
					a[index]=counter;
					counter--;
				}else{//a[index]!=-1
					if(a[index]!=counter){
						isNotMatch=true;
						break;
					}else{
						counter--;
					}
				}
			}//counter>=0
 		}
		index--;
}


	int zero=0;
	int negativeOne=0;

	if(isNotMatch==true){
		System.out.println(-1);
	}else{

		for(int i=0; i<n;i++){

			if(a[i]==0){
				zero++;
			}

			if(a[i]==-1){
				negativeOne++;
			}
		}

		int max=zero+negativeOne;

		System.out.println(zero+" "+max);

	}

        in.close();

    }

}
