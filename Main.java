public class Main {
    public static void main(String args[])
    {
        String str=new String("Hello");
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length()+1;j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
