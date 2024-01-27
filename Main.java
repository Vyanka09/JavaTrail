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

        //Add method to find the addition of 2 numbers

        int a=10;
        int b=12;
        int sum=a+b;
        System.out.println(sum);
    }
}
