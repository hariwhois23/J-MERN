public class PrimeBruteforce {
    public static void main(String[] args) {
        int num = 15 ;
        boolean ans = Prime(num);
        System.out.println(ans);

        
    }
    static boolean Prime(int num){
        int count = 0;
        for(int i = 1; i <= num;i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        else{
            return false;
        }
    }
    
}
