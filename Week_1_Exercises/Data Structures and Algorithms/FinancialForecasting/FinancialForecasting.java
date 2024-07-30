public class FinancialForecasting {
    
    // Method to calculate future value using recursion
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: if years is 0, the future value is the present value
        if (years == 0) {
            return presentValue;
        }
        // Recursive case: calculate the future value for (years - 1) and apply the growth rate
        return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Initial value
        double growthRate = 0.05; // Annual growth rate of 5%
        int years = 10; // Number of years for forecasting

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}
