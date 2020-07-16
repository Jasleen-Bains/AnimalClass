//Jasleen Bains T00651489

public abstract class WaterFowl extends Animal
{
     public WaterFowl(String name, String colour)
     {
          super(name,colour); 
     }
     
     
     public String swim()
     {
          return ("Hey! see "+ super.name + " can swim ");
          //System.out.println("Hey! see "+ super.name + " can swim ");
     }
     public String fly()
     {
          return (super.name + " can fly ");
          //System.out.println(super.name + " can fly ");
     }
}