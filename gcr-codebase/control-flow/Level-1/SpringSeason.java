// Writing a code to check spring season
// Create SpringSeason class


public class SpringSeason {
 
    public static void main(String[] args) {

        // Take input for the month and day
        int month= Integer.parseInt(args[0]);
        int day= Integer.parseInt(args[1]);
        
        // Logic to determine the spring season and displaying
        if(month==3 && (day>=20 && day<=31)) {
            System.out.println("Its a Spring Season");
        }  else if(month==4 && day<=31) {
             System.out.println("Its a Spring Season");
        }  else if(month==5 && day<=31) {
             System.out.println("Its a Spring Season");
        }  else if(month==6 && day>=20) {
             System.out.println("Its a Spring Season");
        }  else {
             System.out.println("Not a Spring Season");
        }

    }
}

