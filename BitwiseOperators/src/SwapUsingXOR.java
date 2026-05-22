public class SwapUsingXOR {
    static void main(String[] args) {
        int a = 5 ;
        int b = 6;
        System.out.println("Before swap using XOR a and b:"+ a+" "+ b);

       //swapping a and b using XOR Only
        a = a^b;
        b = a^b;
        a=a^b;

        System.out.println("After swap using XOR a and b:"+ a+" "+ b);
    }
}
