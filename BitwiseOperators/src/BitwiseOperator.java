public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        //bitwise AND & operator
        System.out.println(a & b);

        //bitwise OR | operator
        System.out.println(a | b);

        //bitwise XOR ^ operator
        System.out.println(a ^ b);

        //NOT Operator also returns in 2s complement
        //if the leftmost bit of the number is 1 then the number is -ve and if it is 0 then it is +ve
        System.out.println(~a);

        // << left shift operator
        // this moves each bit of the number by 1 to the left
        //if i left shift a number 4 then it becomes 2*4=8 or can say 2N where N is the number which is being shifted
        // in extreme case 1 after 32 shifts will reach the lsb and the compiler will treat it as a -ve number

        int n = 1;
        for (int i = 1; i <= 32; i++) {
            n = n << 1;
            System.out.println(n);
            System.out.println();
        }


        // Right Shift >>  operator
        // shift each bit to the right
        // it gives N/2 with each shift if N is the number over which we are performing the right shift operation
        int m = 100;
        for (int i = 1; i <= 32; i++) {
            m = m >> 1;
            System.out.println(m);
        }

        // unsigned right shift >>>


        //even odd using bitwise operator
        // right most bit of odd numbers are 1 and even are 0 thus.... NUM & 1 == 1 then it is ODD and if NUM & 1 == 0 then it is EVEN
        int number = 11;
        if ((number & 1) == 1) {
            System.out.println(number + " is Odd");
        } else {
            System.out.println(number + " ODD");
        }


        //power of 2 representation of the number
        // set bit will always be 1 only
        // 8 = 0000 1000  -> set bit is only 1
        // 16 = 0001 0000  -> set bit is only 1
        // 18 = 0001 0010 -> set bit is 1 and another 1


        //counting the numbers of set bits and checking if it is in the power of 2 or not
        int set = 5;
        int count = 0;
        while (set != 0) {
            if ((set & 1) == 1) {
                count++;
            }
            set = set >> 1;

        }
        if (count == 1) {
            System.out.println(" is power of 2");
            System.out.println("Number if set bits " + count);
        } else System.out.println(" is not power of 2");
        System.out.println("Number if set bits " + count);

        // Another method of finding if it is a power of 2 or not
        // if(n&(n-1)==0) then it is a power of 2
        // n= 8 thus 8 = 0000 1000 and 7 = 0000 0111 thus (n&(n-1)) == 0 always in case of power of 2
        int newnum = 16;
        if ((newnum & (newnum - 1)) == 0) {
            System.out.println(newnum + " is power of 2");
        } else {
            System.out.println(newnum + "is not power of 2");
        }

    }
}

