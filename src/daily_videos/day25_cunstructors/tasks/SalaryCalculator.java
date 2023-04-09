package daily_videos.day25_cunstructors.tasks;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary() {
        return weeklyHours * hourlyRate * 52;
    }

    public double stateTax(int weeklyHours, double hourlyRate) {
        return salary() * stateTaxRate;
    }

    public double federalTax(int weeklyHours, double hourlyRate, double federalTaxRate) {
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax() {
        return salary() - (salary() * federalTaxRate + salary() * stateTaxRate);
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary() +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}
