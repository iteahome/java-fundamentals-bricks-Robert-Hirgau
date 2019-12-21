public class main {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(brickMan(n));
    }

    private static String brickMan(int n) {

        int nr1 = 0;
        int nr2 = 0;
        int i = 0;
        while(n>0)
        {
            i++;
            nr1 = i;
            nr2 = i*2;
            n = n -nr2-nr1;
        }

        if (n + nr2 > 0)
            return "Motu";
        else
            return  "Patlu";
    }
}
