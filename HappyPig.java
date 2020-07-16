//Jasleen Bains T00651489

public class HappyPig extends Animal
{
     public HappyPig(String name, String colour)
     {
          super(name,colour); 
     }
     
     
     public String sleep()
     {
          return("OH! see " + super.name + " is sleeping. ");
     }
     
     public String roll()
     {
          return(" Yes " + super.name + " seems to be rolling. ");
     }
     
}