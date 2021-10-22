
public class Test {

    // default func
    public void PassedTestCase(String id) {
        System.out.println("Test case " + id + " passed");
    }

    // default func
    public void FailedTestCase(String id) {
        System.out.println("Test case " + id + " failed");
    }

    public void theSameEmpoloyee(String name, Employee previousEmp, Employee current) {
        if (previousEmp == null && current == null || !current.equals(previousEmp)) {
            FailedTestCase(name);
            return;
        }

        if (current.equals(previousEmp)) {
            PassedTestCase(name);
        }

    }

    //  public void testAfterRemoved(int amountOfEmpl) {

    public void testAfterRemoved(String name, int amountOfEmpl, EmployeeService es) {
        int y = es.getAllEmpl().length;
        if (es.getAllEmpl().length == amountOfEmpl) {
            FailedTestCase(name);

        }

        if (es.getAllEmpl().length < amountOfEmpl) {
            PassedTestCase(name);
        }

    }

    public void testAfterAdd(String name, int countCurrent, EmployeeService es) {
        int y = es.getAllEmpl().length;

        if (es.getAllEmpl().length > countCurrent) {
            PassedTestCase(name);
        }

        else {
            FailedTestCase(name);
        }

    }


}