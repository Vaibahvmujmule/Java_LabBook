package lab6;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Excercise3 {
         public HashMap<Integer,Integer> squarepair(int[] arr){
        	 HashMap<Integer,Integer> map=new HashMap<>();
        	 for(int i=0;i<arr.length;i++) {
        		 int v=arr[i]*arr[i];
        		 map.put(arr[i],v);
        	 } 
        	 return map;
         }
         public static void main(String[] args) {
        	 Excercise3 ob =new Excercise3();
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the no terms in array");
			int n=sc.nextInt();
			int[] arr =new int[n];
			System.out.println("Enter the values of array");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			 HashMap<Integer,Integer> map=ob.squarepair(arr);
			 for(Entry<Integer, Integer> entry: map.entrySet()) {
				 System.out.println(entry.getKey()+" "+entry.getValue());
			 } 
		}
         
}
