package assignment04.prob4C;

import static java.lang.StringTemplate.STR;

public final class Paycheck {
     private final double grossPay;
     private  final double FICA = 0.23;
     private final double STATE_TAX = 0.05;
     private final double LOCAL_TAX = 0.01;
     private final double MEDICARE = 0.03;
     private final double SOCIAL_SECURITY= 0.075;

     public Paycheck(double grossPay){
         this.grossPay = grossPay;
     }
     public void print(){
          this.toString();
     }

     public String toString(){
          return STR."""
          Gross Salary: \{grossPay}
          * FICA is 23% = \{grossPay*FICA}
          * State tax is 5% = \{grossPay*STATE_TAX}
          * Local tax is 1% = \{grossPay*LOCAL_TAX}
          * Medicare is 3% = \{grossPay*MEDICARE}
          * Social Security is 7.3% = \{grossPay*SOCIAL_SECURITY}
          ==============================

          Net Salary = \{getNetPay()}
          """;
     }

     public double getNetPay(){
         return grossPay - (grossPay * (FICA+STATE_TAX+LOCAL_TAX+MEDICARE+SOCIAL_SECURITY));
     }
}
