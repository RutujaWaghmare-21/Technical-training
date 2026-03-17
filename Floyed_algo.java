public class Floyed_algo {
        public static void main(String[] args) {
        int INF=999999;
        int a[][]= { {0,5,INF,10},
        {INF,0,3,INF},
        {INF,INF,0,1},
        {INF,INF,INF,0} };
    int l=a.length;
        for(int k=0;k<l;k++){
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(a[i][k]+a[k][j]<a[i][j])
                {
                    a[i][j]=a[i][k]+a[k][j];
                }
            }
        }
    }
    for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    
    }
}
