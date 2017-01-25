package forTest.no11;

import java.util.Scanner;

public class Question11_choiym {
/*
 *   1  2  3  4  5
 *1 01 02 03 04 05 
 *2 16 17 18 19 06 
 *3 15 24 25 20 07 
 *4 14 23 22 21 08 
 *5 13 12 11 10 09
 * 
 * 만들어 주세요
 * */
	public static void main(String[] args){
		
	
        int a[][]= new int[5][5];
        //5행 5열짜리 이중배열
        
        
    	int n;
    	//배열의 차수
        int row;
        //배열의 행
        int col;
        //배열의 열
        int k=0;
        //달팽이 안쪽으로 들어갈 때 증가시켜줄 수
        int i =1;//달팽이 배열에 넣을 숫자
              
        for(n=5; n>0;n-=2){//달팽에 차수에 따라 몇번 반복할지
        	//for문이 3번 반복된다. n=5일때 n=3일때 n=1일때
            for(col=0;col<n;col++){
            	//n=5 일때 5번 반복됨.
            	//a[0][0]=1 , a[0][1]=2, a[0][2]=3, a[0][3]=4, a[0][4]=5
            	//n=3일때 k=1 3번 반복됨
            	//a[1][1]=17, a[1][2]=18, a[1][3]=19
                a[k][k+col]=i;
                i++;
               
                        
            }
            for(row=1;row<n;row++){
            	//n=5일때 4번 반복됨
            	//a[1][4]=6, a[2][4]=7, a[3][4]=8 ,a[4][4]=9
            	//n=3일때 k=1 2번 반복됨
            	//a[2][3]=20, a[3][3]= 21
                a[k+row][5-k-1]=i;
                i++;
                System.out.println("2row값 확인 : "+row);
            }
            for(col=1;col<n;col++){
            	//n=5일때 4번 반복됨
            	//a[4][3]=10, a[4][2]=11, a[4][1]=12, a[4][0]=13
            	//n=3일때 k=1 2번 반복됨
            	//a[1+3-1=3][5-1-1-1=2]
                a[k+row-1][5-k-col-1]=i;
                System.out.println("3row값 확인 : "+row);
                i++;
            }
            for(col=1;col<n-1;col++){
            	//n=5일때 3번 반복됨
            	//a[3][0]=14, a[2][0]=15, a[1][0]=16
                a[5-k-col-1][k]=i;
                i++;
              
            }
            //위 4개의 for문이 다 돌면 k를 증가시켜줌
            k++;
        }
        
        //출력
        for(row=0;row<5;row++){
            for(col=0;col<5;col++){
            	int x = a[row][col];
            	if(x<10){
            		System.out.print("0"+x+" ");
            	}else{
            		System.out.print(""+x+" ");
            	}
            }
            System.out.println("");
        }
    }



	 
  }



	

