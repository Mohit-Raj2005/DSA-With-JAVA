public class BitwiseOperator {
    static void main(String[] args) {
        int a = 5;
        int b = 6;

        //bitwise AND & operator
        System.out.println(a & b );

        //bitwise OR | operator
        System.out.println(a | b );

        //bitwise XOR ^ operator
        System.out.println(a ^ b );

        //NOT Operator also returns in 2s complement
        //if the leftmost bit of the number is 1 then the number is -ve and if it is 0 then it is +ve
        System.out.println(~a );

        // << left shift operator
        // this moves each bit of the number by 1 to the left
        //if i left shift a number 4 then it becomes 2*4=8 or can say 2N where N is the number which is being shifted
        // in extreme case 1 after 32 shifts will reach the lsb and the compiler will treat it as a -ve number

        int n=1;
        for (int i=1 ; i <=32; i++){
            n= n<<1;
            System.out.println(n);
            System.out.println();}


        // Right Shift >>  operator
        // shift each bit to the right
        // it gives N/2 with each shift if N is the number over which we are performing the right shift operation
        int m = 100;
            for ( int i = 1 ; i <= 32;i++){
                m=m>>1;
                System.out.println(m);
            }
        }


    }
}
