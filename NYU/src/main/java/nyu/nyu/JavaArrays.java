/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyu.nyu;

import java.util.Arrays;

/**
 *
 * @author nelly
 */
public class JavaArrays {
    public static void main(String args[]){
        //declare an array
        String[] GOATs;
        
        //print array
        //GOATs[0] = new String("Leo");
        //System.out.println(GOATs);
        System.out.println("==================================================");
        
        //initialize
        String[] GOAT = {"Picasso", "Leonado Da vinci", "socrates"};
        
        //print array
        System.out.println(GOAT.clone());
        System.out.println("==================================================");
        
        
        //Change an Array Element
        GOAT[1]="De Caprio";
        
        //print array
        System.out.println(GOAT);
        System.out.println("==================================================");
        
        
        //Array Length
        System.out.println("Length = "+ GOAT.length);
        
        //traversing array
        for(int i=0;i<GOAT.length;i++){//length is the property of array  
            System.out.print(GOAT[i]+",");  
        }  
        
        
        //printing array using for-each loop  
        for(String i:GOAT){
            System.out.print(i+", ");  
        }
        System.out.println("\n");
        System.out.println("==================================================");
        
        
        //declaring and initializing 2D array  
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
        //printing 2D array  
        System.out.print("{");
        for(int i=0;i<3;i++){
            System.out.print("[");
         for(int j=0;j<3;j++){  
           System.out.print(arr[i][j]+" ");  
         }  
         System.out.print("],");  
        } 
        System.out.print("}");
        System.out.println("\n");
        
        
        
        //sort array
        int [] unsorted_array = {45,12,85,32,89,39,69,44,42,1,6,8};
        sortArray(unsorted_array);
        System.out.println("================================================");
        
        //is sorted?
        Boolean ans = isSorted(unsorted_array);
        System.out.println("List is sorted true or false :"+ans);
        System.out.println("================================================");
        
        //binary serach
        int key = 30;  
        int last=arr.length-1; 
        System.out.println("Binary search");
        System.out.print("Searching for "+ key+"...");
        binarySearch(unsorted_array,0,last,key);
        System.out.println("================================================");
        
        //using best search
        key = 45;
        System.out.println("Best search ");
        bestSearch(unsorted_array,key);
        System.out.println("================================================");
        
        
        int array[]={33,3,4,5};//declaring and initializing an array  
        min(array);//passing array to method  
        

    }
    
    //creating a method which receives an array as a parameter  
    static void min(int arr[]){  
    int min=arr[0];  
    for(int i=1;i<arr.length;i++)  
     if(min>arr[i])  
      min=arr[i];  
  
    System.out.println("Smallest value in the array is "+min);  
    }  
    
    
    //issorted
    public static boolean isSorted(int[] a)
    {
        // base case
        if (a == null || a.length <= 1) {
            return true;
        }
 
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
 
        return true;
    }
    
    
    //sort
    static void sortArray(int array[]){
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
             if (array[j] < array [j - 1]) {
              temp = array[j];
              array[j] = array[j - 1];
              array[j - 1] = temp;
             }
            }
        }
        System.out.print("\n[");
        for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }
    
    
    //binary search
    public static void binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
    
    //best search '
    static void bestSearch(int array[], int key){
        if(isSorted(array)){
            binarySearch(array,0,array.length,key);
        }
        else {
            int[] aarr = array;
            int getIndex = Arrays.asList(aarr).indexOf(key);
            System.out.println(key +" is located at "+getIndex+" index");
        }
    }
}
