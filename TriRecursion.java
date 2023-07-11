public class TriRecursion 
{
    public static void main(String args[])
    { 
        Triangle(4, 0);
        NormalTriangle(4, 0);
    }   
    static void Triangle(int r, int c) 
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        { 
            System.out.print("* ");
            Triangle(r, c+1);
        }
        else
        {
        System.out.println();
        Triangle(r-1, 0);
        }
    }
    static void NormalTriangle(int r, int c) 
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        { 
            NormalTriangle(r, c+1);
            System.out.print("* ");
        }
        else
        {
        NormalTriangle(r-1, 0);
        System.out.println();
        }
    }
}
