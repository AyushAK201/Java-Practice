import java.util.ArrayList;

public class SubSeq  
{
    public static void main(String args[])
    {
        subsequence(" ", "abcd");
        System.out.println(subseqRet("", "abc"));
        subsequenceAscii("", "abc");
        System.out.println(subseqRet2("","abc"));
    }   
    static void subsequence(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subsequence(p+ch, up.substring(1));
        subsequence(p, up.substring(1));
    } 
    static ArrayList<String> subseqRet(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseqRet(p+ch, up.substring(1));
        ArrayList<String> right=subseqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subsequenceAscii(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subsequenceAscii(p+ch, up.substring(1));
        subsequenceAscii(p, up.substring(1));
        subsequenceAscii(p+(ch+0), up.substring(1));
    } 
    static ArrayList<String> subseqRet2(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseqRet2(p+ch, up.substring(1));
        ArrayList<String> right=subseqRet2(p, up.substring(1));
        ArrayList<String> Ascii=subseqRet2(p+(ch+0), up.substring(1));
        left.addAll(right);
        left.addAll(Ascii);
        return left;
    } 
}