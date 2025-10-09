public class ReverseM1 {
    public static void main(String[] args) {
        int num =6598;
        System.out.println(rev(num));
        
    }

    static int ans = 0;
    static int rev(int num){
        if(num == 0){
            return ans;
        }
        int rem = num %10;
        ans = ans * 10 + rem;
        return rev(num/10);

    }
    
}
