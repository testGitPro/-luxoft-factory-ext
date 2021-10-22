import java.util.Random;

public class Developer extends Employee  {

    public int fixedBugs;

    @Override
    public String toString() {
        return "Developer{" +
                "fixedBugs=" + fixedBugs +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }

    public Developer(long id, String name, int age, double salary, Gen gender, int fixedBugs) {
        super(id,name,age,salary,gender);
        this.fixedBugs = fixedBugs;


    }

    public double salary() {
        return (salary + fixedBugs * 13.3) * (new Random().nextBoolean() ? 2:0);
    }

}
