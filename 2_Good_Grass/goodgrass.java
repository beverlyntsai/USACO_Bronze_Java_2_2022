import java.util.*;
import java.io.*;



public class goodgrass{


    public static void main(String[] args)throws Exception{


	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader in = new BufferedReader(new FileReader("file.txt"));

	StringTokenizer st = new StringTokenizer(in.readLine());

	int ax1=Integer.parseInt(st.nextToken())+1000;//Because start from -10000, to make it to >=0
	int ay1=Integer.parseInt(st.nextToken())+1000;	
	int ax2=Integer.parseInt(st.nextToken())+1000;
	int ay2=Integer.parseInt(st.nextToken())+1000;

	//System.out.println("AX="+ax1+", AY="+ay1);
	//System.out.println("AX="+ax2+", AY="+ay2);

	st = new StringTokenizer(in.readLine());

	int bx1=Integer.parseInt(st.nextToken())+1000;//Because start from -10000, to make it to >=0
	int by1=Integer.parseInt(st.nextToken())+1000;	
	int bx2=Integer.parseInt(st.nextToken())+1000;
	int by2=Integer.parseInt(st.nextToken())+1000;

	//System.out.println("BX="+bx1+", BY="+by1);
	//System.out.println("BX="+bx2+", BY="+by2);

	st = new StringTokenizer(in.readLine());

	int cx1=Integer.parseInt(st.nextToken())+1000;//Because start from -10000, to make it to >=0
	int cy1=Integer.parseInt(st.nextToken())+1000;	
	int cx2=Integer.parseInt(st.nextToken())+1000;
	int cy2=Integer.parseInt(st.nextToken())+1000;

	//System.out.println("CX="+cx1+", CY="+cy1);
	//System.out.println("CX="+cx2+", CY="+cy2);


	boolean matrix[][]=new boolean[2001][2001];

	//Initial all area to false
	for(int i=0; i<2001;i++){

		for(int j=0; j<2001;j++){
			matrix[i][j]=false;
		}

	}

	//Changed good area A to true
	for(int y=ay1; y<ay2;y++){ //Y is row

		for(int x=ax1; x<ax2;x++){// X is column

			matrix[y][x]=true;
		}

	}


	//Changed good area B to true
	for(int y=by1; y<by2;y++){ //Y is row

		for(int x=bx1; x<bx2;x++){// X is column

			matrix[y][x]=true;
		}

	}

	//Changed bad area c to false
	for(int y=cy1; y<cy2;y++){ //Y is row

		for(int x=cx1; x<cx2;x++){// X is column

			matrix[y][x]=false;
		}

	}


	int count=0;

	for(int y=0; y<2001;y++){//Y

		for(int x=0; x<2001;x++){ //X
			if(matrix[y][x]==true){ //means good area that Bessie can eat
			
				count++;
			}
		}

	}

	System.out.println(count);

        in.close();


    }



}
