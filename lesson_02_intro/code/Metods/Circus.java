package Metods;

public class Circus
{ // begin

    public static void main(String[] args)
    {
        lightOn();
        entertainer();
        lightOff();
    }

          public static void lightOn()
          {
          System.out.println("Ligts ON!");
          }

          public static void lightOff()
          {
          System.out.println("Ligts OFF!");
          }

          public static void entertainer()
          {
          jogger();
          cloun();
          singer();
          }

              public static void jogger()
              {
              System.out.println("I'm jogging....");
              }

              public static void cloun()
              {
              System.out.println("I'm cloun....");
              }

              public static void singer()
              {
              System.out.println("I'm singen....");
              }


} // end
