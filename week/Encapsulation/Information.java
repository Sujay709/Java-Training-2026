public class Information {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void setGender(String newGender) {
        this.gender = newGender;
    }
    public boolean ageCheck() {
        return (this.age > 21);

    }
}

