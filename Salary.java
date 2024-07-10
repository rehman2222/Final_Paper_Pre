class Person {
    // Attributes and methods of the Person class
}

class Employee extends Person {
    private int id;
    private double hourlyPay;

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    // Method to get a raise
    public double getRaise() {
        hourlyPay *= 1.2; // Increase by 20%
        return hourlyPay;
    }

    // Method to calculate payday
    public double payday(int hoursWorked) {
        double totalPay = 0;
        if (hoursWorked > 40) {
            totalPay += 40 * hourlyPay; // 40 hours at normal pay
            totalPay += (hoursWorked - 40) * hourlyPay * 2; // Overtime pay
        } else {
            totalPay = hoursWorked * hourlyPay;
        }
        return totalPay;
    }
}

class Salary{
    
    public static void main(String[] args) {
        // Create an Employee instance
        Employee employee = new Employee();
        
        // Set employee attributes
        employee.setId(101);
        employee.setHourlyPay(20.0);
        
        System.out.println("Initial Hourly Pay after Raise: $" + employee.getRaise());

        // Calculate and display payday amount
        int hoursWorked = 45; // Example hours worked in a week
        double totalPay = employee.payday(hoursWorked);
        System.out.println("Total Pay for " + hoursWorked + " hours worked: $" + totalPay);
    }
}

