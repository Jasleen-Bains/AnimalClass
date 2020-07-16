//Jasleen Bains T00651489

public abstract class Driver
{
     public static void main(String args[])
     {
          
          System.out.println("---------------------CuriousBunny Test--------------------");
          System.out.println();
          CuriousBunny bunny = new CuriousBunny("Sfinster", "White");
          System.out.println(bunny.toString());
          System.out.println("Testing the hop method to see if bunny can hop:-  " + bunny.hop());
          System.out.println("Get bunny's health:-  It is at "+ bunny.getHealth());
          bunny.hit();
          System.out.println("Get bunny's health after hits:-  It is at "+ bunny.getHealth() + " now.");
          System.out.println(bunny.toString());
          System.out.println("Total number of surviving animals:-  " + Animal.getCount());
          System.out.println();
          
          
          System.out.println("---------------------HappyPig Test--------------------");
          System.out.println();
          HappyPig piggy = new HappyPig("Piglet", "Pink");
          System.out.println(piggy.toString());
          System.out.println("Testing the sleep method to see if piggy is sleeping or not:-  " + piggy.sleep());
          System.out.println("Is piggy rolling?  " + piggy.roll());
          System.out.println("Get piggys health:-  It is at "+ piggy.getHealth());
          piggy.hit();
          System.out.println("Get piggys health after hits:-  It is at "+ piggy.getHealth() + " now.");
          System.out.println(piggy.toString());
          System.out.println("Total number of surviving animals:-  " + Animal.getCount());
          System.out.println();
          
          
          System.out.println("---------------------AngryDuck Test--------------------");
          System.out.println();
          AngryDuck ducky = new AngryDuck("Ducky", "Brown");
          System.out.println(ducky.toString());
          System.out.println("Testing the fly method to see if ducky can fly:-  " + ducky.fly());
          System.out.println("Testing the swim method to see if ducky can swim:-  " + ducky.swim());
          System.out.println("Get duckys health:-  It is at "+ ducky.getHealth());
          ducky.hit();
          ducky.hit();
          ducky.hit();
          ducky.hit();
          System.out.println("Get duckys health after hits:-  It is at "+ ducky.getHealth() + " now.");
          System.out.println(ducky.toString());
          System.out.println("Total number of surviving animals:-  " + Animal.getCount());
          System.out.println();
          
          
          System.out.println("---------------------LoudGoose Test--------------------");
          System.out.println();
          LoudGoose goose = new LoudGoose("Twirky", "light blue");
          System.out.println(goose.toString());
          System.out.println("Testing the fly method to see if the goose can fly:-  " + goose.fly());
          System.out.println("Testing the swim method to see if the goose can swim:-  " + goose.swim());
          System.out.println("Get goose's health:-  It is at "+ goose.getHealth());
          goose.hit();
          goose.hit();
          System.out.println("Get goose's health after hits:-  It is at "+ goose.getHealth() + " now.");
          System.out.println(goose.toString());
          System.out.println("Total number of surviving animals:-  " + Animal.getCount());
          System.out.println();  
          
          System.out.println("Total number of surviving Animals till now:-  " + Animal.getCount());
          
     }
}