public class FirstUpperCase 
{
    public static void main(String args[])
    {
       System.out.println(uppercase("ayushK", 0));
    }   
    static char uppercase(String str,int i)
    {
        if(str.isEmpty())
        {
            return 0;
        }
        if(Character.isUpperCase(str.charAt(i)))
        {
            return str.charAt(i);
        }
        return uppercase(str, i+1);

    } 
}
