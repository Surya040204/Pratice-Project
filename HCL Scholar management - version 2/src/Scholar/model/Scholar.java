package Scholar.model;

public class Scholar {
    private int id;
    private String name;
    private String age;
    private String SapId;
    private String location;

    public Scholar(){

    }

    public Scholar(String name, String age, String SapId, String location) {
        this.name = name;
        this.age = age;
        this.SapId = SapId;
        this.location = location;
    }

    public Scholar(int id, String name, String age, String SapId, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.SapId = SapId;
        this.location = location;
    }
    //getters and setter of constructor
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getage() {
        return age;
    }

    public void setage(String age) {
        this.age = age;
    }

    public String getSapId() {
        return SapId;
    }

    public void setSapId(String SapId) {
        this.SapId = SapId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String Location) {
        this.location = Location;
    }

    @Override
    //built in method of Java which returns itself a string
    public String toString() {
        return "Student{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", SapId='" + SapId + '\'' +
                ", location=" + location +
                '}';
    }
}