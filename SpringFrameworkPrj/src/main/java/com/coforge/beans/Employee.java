
package com.coforge.beans;

public class Employee {

    private int eid;
    private String ename;
    private Department dept;

    public Employee(int eid, String ename, Department dept) {
        super();
        this.eid = eid;
        this.ename = ename;
        this.dept = dept;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
    }
}
