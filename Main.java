public class Main
{    public static void main(String[] args)
   {
      Feeder f = new Feeder(1);
      System.out.println(f.getCurrentFood());
      Feeder g = new Feeder(500);
      System.out.println(g.getCurrentFood());
      Feeder h = new Feeder(1000);
      h.simulateOneDay(22);
      System.out.println(h.getCurrentFood());
      Feeder i = new Feeder(100);
      i.simulateOneDay(5);
      System.out.println(i);
      Feeder j = new Feeder(2400);
      System.out.println(j.simulateManyDays(10, 4));
      Feeder k = new Feeder(0);
      System.out.println(k.simulateManyDays(5, 10));
    
   }
}