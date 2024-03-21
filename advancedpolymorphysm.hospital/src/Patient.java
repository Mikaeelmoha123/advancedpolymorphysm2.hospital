
public class Patient {
    private int age;


    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 130) {
            throw new InvalidAgeException("Invalid age provided: " + age + ". Age must be between 0 and 130.");
        }
        this.age = age;
    }


    public int getAge() {
        return age;
    }
}
