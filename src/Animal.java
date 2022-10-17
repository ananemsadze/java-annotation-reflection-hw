@Important
public class Animal {
    String gender;
    int age;

    public Animal(String gender, int age){
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise(){
        System.out.println("This animal makes noise.");
    }
}
