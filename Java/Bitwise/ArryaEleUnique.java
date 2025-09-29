public class ArryaEleUnique {
    public static void main(String[] args) {
        int[] arr = {1,15,2,2,3,3,1};
        System.out.println(xorcheck(arr));

        
    }
    static int xorcheck(int[] arr){
        int unique = 0;
        for(int num: arr){
            unique = unique ^ num;
        }
        return unique;
    }
    
}
