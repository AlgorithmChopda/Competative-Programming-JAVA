/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA_Questions;

/**
 *
 * @author Vinay Jain
 */

import java.util.Scanner;

class Data{
    public  char job[] = new char[20];
    public  int priority,incoming_order;

}
public class PriorityQueue_Implementation extends Data
{
    int front,rear;
    int size;
     static int order;
    PriorityQueue_Implementation()
    {
        front=-1;
        rear=-1;
        order=0;
    }
    boolean isfull()
    {
        if(rear==size-1)
        {
            return true;
        }
        return false;
    }
    boolean IsEmpty()
    {
        if(front==-1)
        {
            return true;
        }
        return false;
    }
    public void Enqueue(Data data ,Data Q[])
    {
        if(isfull())
        {
            System.out.println("overflow occurs");
        }
        else
        {
            if(rear==-1)
            {
                rear=0;
                front=0;
            }
            else
            {
                rear = rear+1;
            }
            Q[rear] = data;
            System.out.print("\n\t"+data.job+" inserted successfully.");
            Data temp;
            for(int i=front;i<rear;i++)
            {
                 for(int j=i+1;j<=rear;j++)
                 {
                        if(Q[i].priority<Q[j].priority)
                        {
                                temp = Q[i];
                                Q[i] = Q[j];
                                Q[j] =  temp;
                        }
                        else 
                        {
                            if(Q[i].priority==Q[j].priority)
                            {
                                if(Q[i].incoming_order>Q[j].incoming_order)
                                {
                                     temp=Q[i];
                                     Q[i]=Q[j];
                                     Q[j]=temp;
                                }
                            }
                        }
                 }
            }
        }
    }
    public void Dequeue(Data Q[])
    {
        Data data;
        if(IsEmpty())
        {
            System.out.println("underflow occurs");
        }
        else
        {
            data = Q[front];
            if(rear==front)
            {
                front=-1;
                rear=-1;
            }
            else
            {
                front = front+1;
            }
            System.out.println(data.job+" deleted successfuly in queue");
        }
       
    }
    public void Display(Data Q[])
    {
        if(IsEmpty())
        {
            System.out.println("underflow occurs");
        }
        else 
        {
            int i;
            for(i=front;i<=rear;i++)
            {
                System.out.print(Q[i].job+" ");
            }
        }
    }
    public static void main(String args[])
    {
        PriorityQueue_Implementation q = new PriorityQueue_Implementation();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the size of the queue :");
        q.size = s.nextInt();
        
        Data Q[] = new Data[q.size];
        Data data = new Data();
        
        char ch;
        
        
        do
        {
            System.out.println("Menu Queue Data Structures");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.IsFull");
            System.out.println("4.IsEmpty");
            System.out.println("5.Display");
            System.out.println("6.getFront");
            System.out.println("7.getRear");
            System.out.println("8.Exit");
            System.out.println("Enter Your Choice :");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter the job name:");
                    data.job = s.next().toCharArray();
                    System.out.println("Enter the priority of job:");
                    data.priority = s.nextInt();
                    data.incoming_order= order++;
                    q.Enqueue(data,Q);
                    break;
                case 2:
                    q.Dequeue(Q);
                    break;
                case 3:
                    System.out.println(q.isfull());
                    break;
                case 4:
                    System.out.println(q.IsEmpty());
                    break;
                case 5:
                    q.Display(Q);
                    break;
                case 6:
                    System.out.println(q.front);
                    break;
                case 7:
                System.out.println(q.rear);
                    break;
                case 8:
                    System.exit(0);
                    break;
                
            }
            System.out.println("Do you want to continue (y/n):");
            ch = s.next().charAt(0);
        }while(ch=='Y'||ch=='y');
    }
}