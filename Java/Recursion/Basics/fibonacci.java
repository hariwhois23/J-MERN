public class fibonacci {
    public static void main(String[] args) {

    }

    static int fibo(int num) {
        if (num <= 1) {
            return num;
        }
        return fibo(num - 1) + fibo(num - 2);
    }

}
