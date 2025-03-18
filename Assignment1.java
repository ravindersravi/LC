# LC
//1. Reverse the Number like 153 => 351 . Numbers can be negative

public class ReverseANUmber {
    public static void main(String[] args) {
        int a = 123; //o/p: 321
        StringBuilder sb = new StringBuilder();
        int finalSum =0;
        while (a > 0) {
            finalSum = a%10; //3
            sb.append(finalSum);
            a= a/10; //12
        }
        System.out.println(sb);
        System.out.println("--------------");
        //direct int;
        int b = 123;
        int finalBSum =0;

        while (b > 0) {
            finalBSum = finalBSum*10+ b%10; //3
            b= b/10; //12
        }
        System.out.println(finalBSum);
    }
}

//-------------------------------------------------------------------------------------------------------

