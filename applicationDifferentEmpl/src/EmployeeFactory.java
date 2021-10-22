import java.util.Random;

public  class EmployeeFactory {
    static public long id = 0;

    static public Employee generateEmployee() {

        Random random = new Random();

        String[] AllNames = {"Vova", "Kate", "Victor", "Anatoliy", "Micle"};
        String name = AllNames[random.nextInt(AllNames.length)];

        int age = random.nextInt(20);
        Employee.Gen gen = random.nextBoolean() ? Employee.Gen.Mr : Employee.Gen.Ms;
        int fixedBugs = random.nextInt(23);
        double defaultBugRate = random.nextInt(13);
        double salary =  (Math.round(random.nextDouble() * 1000)) /  100.0;
        int rate = random.nextInt(23);
        int workerDays = random.nextInt(22);

        int randomCase = (new Random()).nextInt(3);

        switch (randomCase) {
            case 0:
                return new Manager(id++, name, age, salary, gen);
            case 1:
                return  new Developer(id++, name, age, salary, gen,fixedBugs);
            case 2:
                return new Designer(id++, name, age, salary, gen,rate,workerDays);
        }
        return null;
    }




    static public Employee[] ArrayOfEmployee(int amount) {
        Employee[] employee = new Employee[amount];
        for (int i = 0; i < employee.length; ++i) {
            employee[i] = generateEmployee();

        }
        return employee;
    }
}