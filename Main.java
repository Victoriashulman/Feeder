public class Main
{
    public static void main(String[] args)
    {
        //test 1
        Feeder f = new Feeder(500);
        f.simulateOneDay(12);
        System.out.print("Current Food: ");
        System.out.println(f.getCurrentFood());
        //test 2
        Feeder k = new Feeder(1000);
        k.simulateOneDay(22);
        System.out.print("Current Food: ");
        System.out.println(k.getCurrentFood());
         //test3
         Feeder w = new Feeder(100);
         w.simulateOneDay(5);
         System.out.print("Current Food: ");
         System.out.println(w.getCurrentFood());
         //test 4
         Feeder x = new Feeder(2400);
         x.simulateManyDays(10, 4);
         System.out.print("Current Food: ");
         System.out.print(x.getCurrentFood());
    }
}