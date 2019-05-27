public class HelloWorld
{

    private String worldName;
   
   //default constructor
    HelloWorld()
    {
      worldName = null;
    }
    
    //constructor
    HelloWorld(String worldName)
    {
      this.worldName = worldName;
    }
    
    //says hello to specificed world
    public void sayHi()
    {
      System.out.println("Hello " + worldName + "!");
    }
    
    
 }
      
    
      
     
    
     
    
       
     
  
