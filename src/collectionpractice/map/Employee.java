package collectionpractice.map;

public class Employee {
    private String empName;
    private String empId;
    private int empSal;
    private String empDept;
    private String empDes;

    public Employee(String empName, String empId, int empSal, String empDept, String empDes) {
        this.empName = empName;
        this.empId = empId;
        this.empSal = empSal;
        this.empDept = empDept;
        this.empDes = empDes;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpId() {
        return empId;
    }

    public int getEmpSal() {
        return empSal;
    }

    public String getEmpDept() {
        return empDept;
    }

    public String getEmpDes() {
        return empDes;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public void setEmpDes(String empDes) {
        this.empDes = empDes;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId='" + empId + '\'' +
                ", empSal=" + empSal +
                ", empDept='" + empDept + '\'' +
                ", empDes='" + empDes + '\'' +
                '}';
    }
}
