public class student extends person {
    protected String id_student,level,maj;
    public student (String fname , String lname, String sex, int age, int phone,
                    String id_student, String level, String maj) {
        super(fname,lname,sex,age,phone);
        this.id_student="";this.level="";
        this.maj="";this.fname=fname;this.lname=lname;
        this.sex=sex;this.age=age;this.phone=phone;
    }


    public static void main(String[] args) {
        student a =new student("hesham","ishaq","mall",23,777,
                "333","4","IT");
        System.out.println(a);

    }
}
