package TaskWorkParamEmp2;

class Senior extends Employee {
    public Senior(String name, int age) {
        super(name, age);
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public int compareTo(Employee employee) {
        return super.compareTo(employee);
    }
}
