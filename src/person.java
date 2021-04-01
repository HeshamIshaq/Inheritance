public class person {
    protected String fname , lname , sex;
    protected int age , phone;
    public person(String fname, String lname, String sex,
                  int age, int phone) {
        this.fname = "";
        this.lname = "";
        this.sex = "";
        this.age = 0;
        this.phone = 0;}
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String toString(){
        String s= fname+lname+sex+age+phone;return s;
    }
}