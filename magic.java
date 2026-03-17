import java.util.Scanner;
class Magic {
    static int mun(int x, int y)
    {
        int count=0,num=0,result=0;
        while(x>0)
        {
            int n=x%10;
            num=(n+y)%10;
            result= num*((int) Math.pow(10, count));
            count++;
            x=x/10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
       int z= mun(x,y);
       System.out.println(z);
       s.close();
    }
}