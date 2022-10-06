import java.lang.Math;
import java.util.Objects;

public class Main {
    
static int getDistanceNumber(String target, String other, int threshold){
      char[] tar_arr = target.toCharArray();
      int n = tar_arr.length;
      int[] p = new int[n+1];
      int[] d = new int[n+1];
      int  m = other.length();
      if(n !=0 && m !=0) {
         int i;
         for(i=0; i<=n; p[i]=i++) {
         }
         for(int j=1; j<=m; ++j) {
            char t_j = other.charAt(j-1);
            d[0] = j;
            for(i=1;i<=n;++i) {
               int cost = tar_arr[i-1] == t_j ? 0 : 1;
               d[i] = Math.min(Math.min(d[i-1]+1, p[i]+1), p[i-1]+cost);
            }
            int[] d_new = p;
            p = d;
            d = d_new;
         }
         return p[n];
      }
      else {
         return Math.max(m,n);
      }
   }



  public static void main(String[] args) {
    int ans= getDistanceNumber("cat", "cayyyyyyt", 1);
    System.out.println(ans);
    
  }
}
