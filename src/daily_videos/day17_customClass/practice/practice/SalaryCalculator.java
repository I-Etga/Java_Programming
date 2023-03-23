package daily_videos.day17_customClass.practice.practice;

public class SalaryCalculator {

    public double hourlyRate ;
    public double stateTaxRate ;
    public double federalTaxRate ;
    public int weeklyHours ;
    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
        return (hourlyRate * weeklyHours * 52);
    }

        public double stateTax(){
        return salary()*(stateTaxRate /100);
    }
        public double federalTax(){
        return salary()*(federalTaxRate/100);
    }

        public double salaryAfterTax(){
        return salary()-(federalTax() + stateTax());
    }
    public String toString() {
        return "SalaryCalculator{" + "salary= " + salary() +
                ",stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ",Salary after tax= " + salaryAfterTax()+
                '}';
    }
    public static void main(String[] args) {
        SalaryCalculator salary = new SalaryCalculator();

        salary.setInfo(15,8,10,40);

        System.out.println(salary.toString());

    }
}
