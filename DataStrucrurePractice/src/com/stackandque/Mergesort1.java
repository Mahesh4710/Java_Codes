package com.stackandque;

public class Mergesort1 {
	  public static void conquer(int arr[],int si,int mid,int ei)
	  {
		  int merged[]=new int[ei-si+1];
		  int idx1=si;
		  int idx2=mid+1;
		  int x=0;
		  
		  while(idx1<=mid && idx2<=ei) //1-(6>9 && 5<=8
		  {
			  if(arr[idx1]<=arr[idx2]) // 6<=5--f
			  {
				  merged[x++]=arr[idx1++];
			  }
			  else
			  {
				  merged[x++]=arr[idx2++]; //2++ 3==2
			  }
		    }
	      while(idx1<=mid) //2<9
	      {
	    	  merged[x++]=arr[idx1++];//3
	      }
	     while(idx2<=ei)
	     {
	    	 merged[x++]=arr[idx2++];
	     }
	     for(int i=0,j=si;i<merged.length;i++,j++)
	     {
	    	 arr[j]=merged[i];
	     }
	  }
	    public static void divide(int arr[],int si,int ei )
	    {
	    	if(si>=ei)
	    	{
	    		return;
	    	}
	      int mid=si+ (ei-si)/2;
	      divide(arr,si,mid);
	      divide(arr,mid+1,ei);
	    }
	    public static void main(String args[])
	    {
	    	int arr[]= {6,3,9,5,2,8};
	    	int n=arr.length;
	    
	      divide(arr,0,n-1);  // 0--starting index, n-1--ending index
	      
	      for (int i=0;i<n;i++)
	      {
	    	  System.out.println(arr[i]+" "); 
	      }
	      System.out.println();  
	    }
	}