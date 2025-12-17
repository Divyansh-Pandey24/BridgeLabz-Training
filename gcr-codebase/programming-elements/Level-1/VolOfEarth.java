//Writing a code to calculate the volume of earth

// Create volOfEarth class to calculate the volume of earth
public class VolOfEarth
{
  public static void main(String []args)
  {
   
        // Create a variable to indicate radiusKm to hold radius value in km
        double radiusKm = 6378; //

        // create a variable KmToMiles 
        double kmToMiles = 0.621371;

        // Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3); //

        // Calculate radius in miles
        double radiusMiles = radiusKm * kmToMiles;
        
        // Calculate volume in cubic miles using the radius in miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
       
        //Print the volume in cubic kilometers and cubic miles
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);

    
 }
}
