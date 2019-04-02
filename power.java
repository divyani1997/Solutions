public class Solution {
    public int pow(int x, int n, int d) {
        if(n==0)
          return 1%d;
        if(x==0)
          return 0;
        long res;
        if(n%2==0){
           res=pow(x,n/2,d);
           res=(res*res)%d;
        } else{
            res=x%d;
            res=(res*pow(x,n-1,d)%d)%d;
        }
        return (int)((res+d)%d);
    }
    
}
