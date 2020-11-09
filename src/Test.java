import javax.smartcardio.CardTerminal;

public class Test {
    public static void main(String[] args) {
// 1)    float f = 123.2f;
//        float d = (float)123.2;
     /////////////////////
// 2)    int a = 123;
//
//     int l =a;
//     int x = (int)l;
//        System.out.println(x);
     //////////////////////
// 3)     int a = 123;
//        double x = a;
//        System.out.println(x); // 123.5
     /////////////////////
// 4)    double x = 123.5;
//     int y = (int)x;
//        System.out.println(y); // 123 (!int)
     ////////////////////
// 5)       double x = 123.6;
//        int y = (int)x;
//        System.out.println(y); // 123 (!int)
//        long l = Math.round(x);
//        System.out.println(l);
        byte x = (byte)128;
        System.out.println(x);
    }
}
