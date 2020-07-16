//Jasleen Bains T00651489

public class CuriousBunny extends Animal
{
     public CuriousBunny(String name, String colour)
     {
          super(name,colour); 
     }
     
     public String hop()
     {
          return("Hop! Hop! " + super.name + " loves hopping:)");
     }
     
}