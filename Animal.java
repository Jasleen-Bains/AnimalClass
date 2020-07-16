public abstract class Animal
{
     protected String name;
     protected String colour;
     protected int health = 3;
     protected static int count = 0;
     //Jasleen Bains T00651489
     
     public Animal(String name, String colour)
     {
          this.name = name;
          this.colour = colour;
          count++;
     }
     
     public String getName()
     {
          return name;
     }
     
     public String getColour()
     {
          return colour;
     }
     
     public int getHealth()
     {
          return health;
     }
     
     public static int getCount()
     {
          return count;
     }
     
     public void hit()
     {
          if (health>0)
          {
               health--;
          }
          else
          {
               count--;
               System.out.println("OOPs! " + name + " is dead.");
          }
     }
     
     public String toString()
     {
          return "The " + this.getClass().getSimpleName() + " in colour " + colour + " called by the name " + name + " is left with " + health + " health ";
     }
     
     
     
}