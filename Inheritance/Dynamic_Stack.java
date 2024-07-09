package Inheritance;
import java.util.*;
public class Dynamic_Stack extends Stack{
     @Override
     public void push(int item) {
    	 if(this.isfull()) {
    		int []newarr=new int [2*arr.length]; 
    		for(int i=0;i<arr.length;i++) {
    			newarr[i]=arr[i];
    		}
    		arr=newarr;
    	 }
    	 top++;
    	 arr[top]=item;
     }

}
