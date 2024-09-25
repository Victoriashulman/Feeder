public class Main
{
    public static void main(String[] args)
    {
        //test 1
        Feeder f = new Feeder(500);
        f.stimulateOneDay(12);
        System.out.println(f.getCurrentFood);
    }
}