public class OperatorsPractice {
    // Exercise 1: Calculate shopping cart total
    public static double calculateTotal() {
        // TODO: Calculate and return the total cost of:
        // 2 apples at $0.50 each
        double apple_cost = 0.50;
        double bread_cost = 2.25;
        double bananas = 0.3; 
        double total_cost = apple_cost + apple_cost + bread_cost + (3 * bananas);

        // 1 loaf of bread at $2.25
        // 3 bananas at $0.30 each
        return total_cost; // Replace with your calculation
    }

    // Exercise 2: Write comparison expressions
    public static boolean isEligibleToVote(int age) {
        // TODO: Return true if age is 18 or older
        if (age >= 18){
            return true;
        }
        return false; // Replace with your comparison
    }

    public static boolean isPassingGrade(int grade) {
        // TODO: Return true if grade is 70 or higher
        boolean passed = false;
        if (grade >= 70){
            passed =  true;
        }
        return passed; // Replace with your comparison
    }

    public static boolean isBelowFreezing(double temperature) {
        // TODO: Return true if temperature is below 32°F

        return temperature < 32; // Replace with your comparison
    }

    // Exercise 3: Check if number is positive
    public static void checkPositive(int number) {
        // TODO: Print "The number is positive" if number is greater than 0
    }

    // Exercise 4: Check if number is even or odd
    public static void checkEvenOdd(int number) {
        // TODO: Print "Even" if number is even, "Odd" if number is odd
    }

    // Exercise 5: Determine age category
    public static String getAgeCategory(int age) {
        // TODO: Return "Child" if age < 13
        // Return "Teen" if age is between 13 and 19
        // Return "Adult" if age is 20 or older

        if(age< 13){
            return "child";
        }
        else if (age >= 13 && age < 20){
            return "teen";
        }
        return "Adult"; // Replace with your code
    }

    // Test your solutions
    public static void main(String[] args) {
        // Exercise 1 Test
        System.out.println("Shopping cart total: $" + calculateTotal());

        // Exercise 2 Tests
        System.out.println("Is 20 eligible to vote? " + isEligibleToVote(20));
        System.out.println("Is 75 a passing grade? " + isPassingGrade(75));
        System.out.println("Is 30°F below freezing? " + isBelowFreezing(30));

        // Exercise 3 Test
        checkPositive(5);

        // Exercise 4 Test
        checkEvenOdd(7);

        // Exercise 5 Test
        System.out.println("Age category for 15: " + getAgeCategory(15));
    }
}