public class Designer extends Employee {

    public int rate;
    public int  workedDays;

    public Designer(long id, String name, int age, double salary, Gen gender, int rate, int workedDays) {
        super(id, name, age, salary, gender);
        this.rate = rate;
        this.workedDays = workedDays;
    }


    public double salary() {
        return salary + rate * workedDays;
    }
}
