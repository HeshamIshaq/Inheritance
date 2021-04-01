public class PostGraduate extends student {


    protected String search;
    public PostGraduate(String fname, String lname, String sex, int age,
                        int phone, String id_student, String level, String maj) {
        super(fname, lname, sex, age, phone, id_student, level, maj);
        this.fname=fname;this.lname=lname;this.sex=sex;
        this.age=age;this.phone=phone;this.id_student=id_student;
        this.level=level;this.maj=maj;
    }


    public static void main(String[] args) {
        PostGraduate b = new PostGraduate("H","I","M",23,777,"050101","2","IT");
        System.out.println(b);
    }



}
