package HomeWork;

public class Method
{

public static void main(String[] args)
{
    method1();
}

         public static void method1()
         {
             System.out.println("Method has started");
             System.out.println("Method1 finishers");
             method2();
         }

         public static void method2()
         {
             System.out.println("Method2 has started");
             System.out.println("Method2 finishers");
             method3();
         }

         public static void method3()
         {
             System.out.println("Method3 has started");
             System.out.println("Method3 finishers");
         }
}