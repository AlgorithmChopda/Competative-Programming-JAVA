
package hackerrank;

class Node
{
    Node left , right;
    int  data;
    
    public Node(){
        left = null;
        right = null;
    }
}

class Data
{
    int min;
    int max;
}

public class HackerRank_isBinaryTree 
{
    public static void main(String args[])
    {
        Node root = new Node();
        root.data = 30;
        
        Tree_Operations t = new Tree_Operations();
        Data left = new Data();
        Data right = new Data();
        
        t.generate_Tree(root);
        t.print(root);
        
        System.out.println("\n "+t.isBST(root,left,right,true));
    }
}

class Tree_Operations
{
    public void print(Node root)
    {
        if(root == null)
            return;
        
        print(root.left);
        System.out.print("\n "+root.data);
        print(root.right);
    }
    
    public void generate_Tree(Node root)
    {
        root.left = new Node();
        root.left.data = 20;
        
        root.right = new Node();
        root.right.data = 40;
        
        root.left.left = new Node();
        root.left.left.data = 10;
        
        root.left.right = new Node();
        root.left.right.data = 15;
    }
    
    public void Initialize(Data d)
    {
        d.min = Integer.MAX_VALUE;
        d.max = Integer.MIN_VALUE;
    }
    
    public boolean NotInitialized(Data d) // true if not intialized else false;
    {
        if(d.min == Integer.MAX_VALUE && d.max == Integer.MIN_VALUE)
            return false;
        else
            return true;
    }
    
    public boolean isBST(Node root, Data left, Data right, boolean flag)
    {
        int min , max;
        
        if(root == null)
            return true;
        
        int ele = root.data;
        
        Initialize(left);
        isBST(root.left,left,right,false);
        
        min = left.min;
        max = left.max;
        
        Initialize(right);
        isBST(root.right,left,right,true);
        
        if(min == Integer.MAX_VALUE && max == Integer.MIN_VALUE){
            min = root.data;
            max = root.data;
        }
        
        if(NotInitialized(right)){
            right.min = root.data;
            right.max = root.data;
        }
        
        if(ele >= max && ele <= right.min){
            if(flag){// right
               right.min = min;
            }
            else{
                left.min = min;
                left.max = right.max;
            }
            return true;
        }
        return false;
    }
}
