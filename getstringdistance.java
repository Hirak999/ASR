import java.lang.Math;
import java.util.Objects;

public class Main {

   //finding the distance between the target string and the given string

   public static float getDistance(String target, String other){
      char[] tar_arr = target.toCharArray();  //converting the target to character array
      int n = tar_arr.length;    //n stores the target string
      int[] p = new int[n+1]; // array of size n+1
      int[] d = new int[n+1]; // array of size n+1
      int  m = other.length(); //m stores the length of the other array

      if(n !=0 && m !=0)  //if both the lengths of the target string and the other string is >0 the proceed
      {
         int i;
         for(i=0; i<=n; p[i]=i++) 
         {
            //each index of p[i] is storing the value of i like  | 0 | 1 | 2 | 3 | 4 | 5 
         }
         for(int j=1; j<=m; ++j) 
         {
            char t_j = other.charAt(j-1); //t_j gets assigned with other[j-1]
            d[0] = j; 
            for(i=1;i<=n;++i) 
            {
               int cost = tar_arr[i-1] == t_j ? 0 : 1; 
               d[i] = Math.min(Math.min(d[i-1]+1, p[i]+1), p[i-1]+cost);
            }
            int[] _d = p;
            p = d;
            d = _d;
         }
         return 1.0F - (float)p[n] / (float)Math.max(other.length(), tar_arr.length); 
      }
      else {
         return n==m ? 1.0F : 0.0F;
      }     
   }


  public static void main(String[] args) {
    float ans= getDistance("geek", "gesek");
    System.out.println(ans);
    
  }
}
