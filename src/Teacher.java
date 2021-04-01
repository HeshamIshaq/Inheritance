public class Teacher extends person {
    protected String subject;
    protected double Sallary;
    public Teacher() {
        super(fname, lname, sex, age, phone);
        this.subject="";this.Sallary=0.0;
        this.fname=fname;this.lname=lname;
        this.sex=sex;this.age=age;this.phone=phone;

    }}
