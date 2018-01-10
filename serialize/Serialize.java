import java.io.*;

public class Serialize
{
	public static void main(String[] args)
	{
		String x = "www.jeremiahfaria.com";

                System.out.print("\n" + "Serialize a String:" + "\n");
                Serialize.serialize(x);
   	
                System.out.print("\n" + "Deserialize a String:" + "\n");
                Serialize.deserialize(x);

		System.out.print("\n");
	}
	public static void serialize(String data, String filename)
	{
		try
		{
			//Save object in a file
           		FileOutputStream fos = new FileOutputStream(filename);
           	 	ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(data);
			out.flush();
			System.out.print("Object serialized in file " + filename);
			//System.out.print(out.toString() + "\n");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static void deserialize(String filename) {
	
		String s = null;
 
        
        	try
        	{   
            	// Read the object from a file
            	FileInputStream file = new FileInputStream(filename);
            	ObjectInputStream in = new ObjectInputStream(file);
             
            	// Method for deserialization of object
            	s = (String)in.readObject();
             
            	in.close();
            	file.close();
             	
		//print result
            	System.out.println("Object has been deserialized ");
            	System.out.println("Deserialized string = " + s);
        }
         
        catch(Exception ex)
        {
            System.out.println(ex);
        }
	
	
	}
}
