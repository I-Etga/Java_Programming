package daily_videos.day25_cunstructors.tasks.salary;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHours = weeklyHours;
    }

    public double salary() {
        return weeklyHours * hourlyRate * 52;
    }

    public double stateTax() {
        return salary() * stateTaxRate;
    }

    public double federalTax() {
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
