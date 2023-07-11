import java.util.ArrayList;

public class Maze 
{
    public static void main(String args[])
    {
        //  System.out.println(count(3,3));
        //  path(" ",3,3);
        //  System.out.println(Pathdiag(" ", 3, 3));
        boolean[][] board={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        pathwithrestriction(" ", board, 0,0);
    }  
    static int count(int r, int c)
    {
        if(r==1||c==1)
        {
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        //int diag=count(r-1,c-1);->if diagonal is considered
        return left+right;//+diag;
    }  
    static void path(String p,int r,int c)
    {
        if(r==1&&c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            path(p+'D',r-1,c);
        }
        if(c>1)
        {
            path(p+'R',r,c-1);
        }
        // if(r>1&&c>1)
        // {
        //     path(p+"D",r-1,c-1);->If diagonal is considered
        // }
    }
    static ArrayList<String> Pathdiag(String p, int r, int c)
    {
        if(r==1&&c==1)
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        if(r>1)
        {
            ans.addAll(Pathdiag(p+'D', r-1, c));
        }
        if(c>1)
        {
            ans.addAll(Pathdiag(p+"R", r, c-1));
        }
        if(r>1&&c>1)
        {
            ans.addAll(Pathdiag(p+"D", r-1, c-1));//-->If diagonal is considered  
        }
        return ans;
    }
    static void pathwithrestriction(String p,boolean[][]maze,int r,int c)
    {
        if(r==maze.length-1&&c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])//maze[r][c]==false
        {
            return;
        }
        if(r<maze.length-1)
        {
            pathwithrestriction(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1)
        {
            pathwithrestriction(p+'R',maze,r,c+1);
        }
        // if(r>1&&c>1)
        // {
        //     path(p+"D",r-1,c-1);->If diagonal is considered
        // }
    }
}
