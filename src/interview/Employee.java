package interview;

public class Employee {
    private String empName;
    private int empSalary;
    private String empDesignation;

    public String getGender() {
        return gender;
    }

    private String gender;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee(String gender) {
        this.gender = gender;
    }

    public Employee(String empName, int empSalary, String empDesignation) {
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDesignation = empDesignation;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empDesignation='" + empDesignation + '\'' +
                '}';
    }
}
