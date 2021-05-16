public class GRetestNumber {

    public static void main(String[] args)
    {
        int a=10,b=20,c=30;

        if(a>b && a>c)
        {
            System.out.println("A is greatest");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is greatest");
        }

        else {
            System.out.println("C is greatest");
        }
        System.exit(1);
    }
   // https://www.edureka.co/blog/system-exit-in-java/
}
