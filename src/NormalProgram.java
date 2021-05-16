public class NormalProgram {

    //instance variable
    int i;

    //method
    void setValue(int x)
    {
      i=x;
    }

    //create method to print instance variable
    void show()
    {
        System.out.println(i);
    }
}

class Xyz
{
    public static void main(String[] args)
    {
        //Create object
        NormalProgram obj = new NormalProgram();
        obj.setValue(10);
        obj.show();
    }
}
