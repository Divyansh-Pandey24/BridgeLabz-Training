public class ZaraBonus {

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData(int employees) {
        int[][] data = new int[employees][2];

        for (int i = 0; i < employees; i++) {

            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to display summary and totals
    public static void displaySummary(int[][] oldData, double[][] newData) {

           double totalOldSalary = 0;
           double totalNewSalary = 0;
           double totalBonus = 0;

           System.out.println("\nEmployee Bonus Details (ZARA)");

           

           System.out.println("Emp  OldSalary  Years  Bonus   NewSalary");
           

           for (int i = 0; i < oldData.length; i++) {

           int oldSalary = oldData[i][0];
           int years = oldData[i][1];
           double bonus = newData[i][1];
           double newSalary = newData[i][0];

           totalOldSalary = totalOldSalary + oldSalary;
           totalBonus = totalBonus + bonus;
           totalNewSalary = totalNewSalary + newSalary;

           System.out.println(
                   (i + 1) + "    " +
                   oldSalary + "     " +
                   years + "      " +
                   bonus + "   " +
                   newSalary
              );
           }

          System.out.println("Total Old Salary : " + totalOldSalary);
          System.out.println("Total Bonus      : " + totalBonus);
          System.out.println("Total New Salary : " + totalNewSalary);
    }


    public static void main(String[] args) {

        int employees = 10;

        // calling methods 
        int[][] employeeData = generateEmployeeData(employees);
        double[][] updatedSalary = calculateBonus(employeeData);

        displaySummary(employeeData, updatedSalary);
    }
}
