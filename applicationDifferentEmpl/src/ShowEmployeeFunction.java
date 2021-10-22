public class ShowEmployeeFunction extends Test {

    EmployeeService employeeService;
    int amountOfEmpl = 10;


    public ShowEmployeeFunction() {

        // create instance of EmployeeService (allows to work with array)
        employeeService = new EmployeeService(EmployeeFactory.ArrayOfEmployee(amountOfEmpl));

        // print all employee
        employeeService.printEmployee();

        // getById
        Employee empById =  employeeService.getById(5l);
        //

        // getById
        Employee[] empByName = employeeService.getByName("Vova");

        // sortByName
        Employee[] sortByName = employeeService.sortByName();

        // sortBySalary
        Employee[] sortBySalary = employeeService.sortBySalary();
        // EditEmp
        Employee emlForEdit = new Developer(2, "Taras", 90, 10, Employee.Gen.Mr,6000);
        Employee previousEmpl = employeeService.edit(emlForEdit);

        // RemoveEmp
        Employee removeEmpl = employeeService.remove(4);
        testAfterRemoved();
        // addEmp
        int currentCount = employeeService.getAllEmpl().length;
        Employee emlForAdd = new Developer(2l, "Bogdane", 18, 600, Employee.Gen.Mr,6);
        employeeService.addEmp(emlForAdd);
        testAfterAdd(currentCount);

        // Invoke TestCase for Edit Fjnction
        testEditService();


    }

    public void  testEditService() {
        String name = "edit";
        Employee previousEmp = new Developer(2, "Taras", 90, 10, Employee.Gen.Mr,6000);
        Employee current = employeeService.getById(3l);
        theSameEmpoloyee(name,previousEmp,current);

    }
    public void  testAfterRemoved() {
        String name = "remote";
        EmployeeService es = this.employeeService;

        testAfterRemoved(name,amountOfEmpl, es);

    }

    public void  testAfterAdd(int countCurrent) {
        String name = "add";
        EmployeeService es = this.employeeService;

        testAfterAdd(name,countCurrent, es);

    }

}