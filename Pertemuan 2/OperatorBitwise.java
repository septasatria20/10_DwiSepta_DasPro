public class OperatorBitwise{
    public static void main(String[] args) {
        int a = 5;//0101
        int b = 7;//0111
        System.out.println(a|b);//output 7
        System.out.println(a&b);//output 5
        System.out.println(a^b);//output 2
        System.out.println(~a);//
        //0101
        //0111
        //___
        //0101 -> 5    
    }
}