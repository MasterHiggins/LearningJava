public class InvestmentCalculator {
    public static void main(String[] args) {
        double initialInvestment = 1000.0; // Initial investment
        double annualInterestRate = 0.05; // Annual interest rate, which is 5%

        System.out.println("Year\tAmount on Deposit");

        for (int year = 1; year <= 10; year++) { //Looping for 10 years
            double amount = initialInvestment * Math.pow(1 + annualInterestRate, year);
            System.out.printf("%d\t$%.2f%n", year, amount);
        }
    }
}

//Some stack overflow usage for the output