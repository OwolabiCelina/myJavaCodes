//package employee;
//
//public class BPlusCommissionEmployee extends CommissionEmployee {
//    private double baseSalary;
//
//    public BPlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
//        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
//
//
//            // if baseSalary is invalid throw exception
//            if (baseSalary < 0.0) {
//                throw new IllegalArgumentException("Base salary must be >= 0.0");
//            }
//            this.baseSalary = baseSalary;
//
//        }
//        // set base salary
//        public void setBaseSalary ( double baseSalary){
//            if (baseSalary < 0.0) {
//                throw new IllegalArgumentException("Base salary must be >= 0.0");
//            }
//            this.baseSalary = baseSalary;
//        }
//
//        // return base salary
//        public double getBaseSalary () {
//            return baseSalary;
//        }
//        // calculate earnings
//        @Override // indicates that this method overrides a superclass method
//        public double earnings () {return baseSalary + super.earnings();
//    }
//
//    // return String representation of BasePlusCommissionEmployee
//    @Override
//    public String toString() {
//        return String.format(
//                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
//                "base-salaried commission employee", firstName, lastName,
//                "social security number", socialSecurityNumber,  commissionRate,
//                "base salary", baseSalary));
//    }
//}
