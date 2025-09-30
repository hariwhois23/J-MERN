public class CountDigits {
    public static void main(String[] args) {

        int num = 256;
        System.out.println(Digits1(num,2));

    }
//This works for all the bases 
    static int Digits1(int num, int base){
        int count = (int)(Math.log(num)/Math.log(base)) +1;
        return count;

    }


    static int Digits(int num) {
        int count = 0;
        while (num > 0) {
            count += 1;
            num = num >> 1;
        }
        return count;
    }

}
