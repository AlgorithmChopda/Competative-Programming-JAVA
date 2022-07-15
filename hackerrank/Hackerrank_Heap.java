package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Hackerrank_Heap 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Heap h = new Heap(n);
        
        for(int i = 0 ; i < n ; i++){
            
            int val = sc.nextInt();
        
            if(val == 1) // performing Insertion
                h.insert(sc.nextInt());
        
            else{
                
                if(val == 2)
                    h.delete(sc.nextInt());
                else
                    h.printMin();
            }
            
        }
        
        h.print();
        sc.close();
    }
}


class Heap
{
    int heap[];
    int n = -1;
    ArrayList<Integer> op = new ArrayList<>();
    Heap(int n1){
        heap = new int[n1];
    }    
    
    public void swap(int heap[] , int n , int n1)
    {
        int temp = heap[n];
        heap[n] = heap[n1];
        heap[n1] = temp;
    }
    
    public void insert(int val)
    {
        n++;
        heap[n] = val;
        int temp = n;
        while(n > 0 && heap[temp/2] > heap[temp]){
            swap(heap,temp,temp/2);
            temp /= 2;
        }
       // System.out.print(" array is : ");
        //for(int i = 0 ; i <= n ; i++){
          //  System.out.print(" "+heap[i]);
        //}
     //   System.out.println("\n value of n : "+n);
    }
    
    
    public void Heapify(int n , int i)
    {
        int largest = i; 
        int l = 2 * i + 1;
        int r = 2 * i + 2; 
 
        if (l < n && heap[l] < heap[largest])
            largest = l;
 
        if (r < n && heap[r] < heap[largest])
            largest = r;
 
        if (largest != i) {
            int swap = heap[i];
            heap[i] = heap[largest];
            heap[largest] = swap;
 
            Heapify(n, largest);
        }
  
    }
    public void delete(int val)
    {
        op.add(heap[0]);
        heap[0] = heap[n];
        n--;
        Heapify(n, 0);
    }
    
    public void printMin()
    {
       op.add(heap[0]);
       //return heap[0];
    }
    
    public void print()
    {
        for(Integer i : op){
            System.out.println("\n "+i);
        }
    }
}



