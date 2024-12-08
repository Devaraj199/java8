package interview.day2;

public class Emp {
    private String empName;
    private String empDept;
    private int empSal;


    public Emp(String empName, String empDept, int empSal) {
        this.empName = empName;
        this.empDept = empDept;
        this.empSal = empSal;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empSal=" + empSal +
                '}';
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }
}
