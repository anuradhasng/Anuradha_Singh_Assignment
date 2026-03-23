
package com.coforge.beans;

public class Customer {

    private String cname;
    private long cid;
    private Address address;
    private String mobile;
    private String email;

    public Customer(String cname, long cid, Address address, String mobile, String email) {
        this.cname = cname;
        this.cid = cid;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public Customer() {}

 
    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer [cname=" + cname + ", cid=" + cid +
               ", address=" + address + ", mobile=" + mobile +
               ", email=" + email + "]";
    }
}
