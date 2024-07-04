class Reverseofnum{
    public static void main(String args[]){
        int num = 123;
        System.out.println("the reverse of the number");
        int rev =0;
        int digit;
        while(num!=0){
            digit = num%10;
            rev = rev*10;
            rev = rev+digit;
            num = num/10;

        }
        System.out.println(rev);
    }
}
