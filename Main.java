public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder();
        System.out.println (f);
        //System.out.println (f.currentfood);
        System.out.println(f.getCurrentFood());
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());
        int random = (int) (Math.random() * 10+1);
        System.out.println(random);
        System.out.println(Math.random() < 0.05);
        Feeder k = new Feeder(800);
        System.out.println(k.simulateManyDays(5, 10));
    }
}