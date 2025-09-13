import java.util.ArrayList;
public class PrimeDivisorsEfficient {
    public static void main(String[] args) {
        int num = 780;
        System.out.println(PrimeFactor(num));
        
    }
    static ArrayList<Integer> PrimeFactor(int num){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 2; i*i <= num; i++){
            if(num%i==0){
                ans.add(i);

                while(num%i==0){
                    num = num/i;
                }
            }
        }
         if(num != 1){
                ans.add(num);
            }

        return ans;
    }
}
