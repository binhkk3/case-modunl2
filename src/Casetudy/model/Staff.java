package Casetudy.model;

public class Staff {
    private String name;
    private int age;
    private boolean type;
    private boolean status;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Staff(String name, int age, boolean type, boolean status) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.status = status;
    }

    public Staff() {
    }

    public int salary (boolean type){
        if (type == true){
            return 50000000;
        }
        return 20000000;
    }

    @Override
    public String toString() {
        if(type==true&&status==true){
            return "Staff{" +
                    "name='" + name + '\'' +
                    ", id="+id +
                    ", age=" + age +
                    ", type=" +"full time" +
                    ", status=" + "đang làm" +
                    ", salary="+ salary(type)+ "đồng"+
                    '}';
        }
        if (type==false&&status==false){
            return "Staff{" +
                    "name='" + name + '\'' +
                    ", id="+id +
                    ", age=" + age +
                    ", type=" +"part time" +
                    ", status=" + "đang nghỉ" +
                    ", salary="+ salary(type)+ "đồng"+
                    '}';
        }
        if (type==true&&status==false){
            return "Staff{" +
                    "name='" + name + '\'' +
                    ", id="+id +
                    ", age=" + age +
                    ", type=" +"full time" +
                    ", status=" + "đang nghỉ" +
                    ", salary="+ salary(type)+ "đồng"+
                    '}';
        }
        else {
            return "Staff{" +
                    "name='" + name + '\'' +
                    ", id="+id +
                    ", age=" + age +
                    ", type=" +"part time" +
                    ", status=" + "đang làm" +
                    ", salary="+ salary(type)+ "đồng"+
                    '}';
        }

    }
}
