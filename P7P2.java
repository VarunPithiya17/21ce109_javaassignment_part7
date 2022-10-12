import java.util.*;

class P7P2
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);

        String str="a set of words that is complete in itself, typically containing a subject and predicate, conveying a statement, question, exclamation, or command, and consisting of a main clause and sometimes one or more subordinate clauses.";
        String[] splitStr=str.split(" ",CountSpaces(str));

        TreeMap<String,Integer> occr=new TreeMap<String,Integer>();
       
        for(String s:splitStr)
        {
            if(occr.containsKey(s))
            {
                int cnt=occr.get(s);
                cnt=cnt+1;
                occr.put(s,cnt);
            }
            else
            {
                occr.put(s,1);
            }
        }
        System.out.println(occr);
    }

    public static int CountSpaces(String str)
    {
        int cnt=1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                cnt++;
            }
        }
        return cnt;
    }
}
