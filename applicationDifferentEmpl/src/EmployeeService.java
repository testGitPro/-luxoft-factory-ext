public class EmployeeService {

    private Employee[] employee;

    public EmployeeService(Employee[] employees) {
        this.employee = employees;
    }

    public Employee[] getAllEmpl() {
        return employee;
    }


    public void printEmployee() {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
    }

    public Employee getById(Long id) {
        for (Employee emp : employee) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public Employee[] getByName(String name) {
        int counter = 0;
        for (Employee emp : employee) {
            if (emp.getName().equals(name)) {
                counter++;

            }
        }

        if (counter == 0) {
            return null;
        }

        Employee[] arrayEmp = new Employee[counter];
        int arrayCounter = 0;

        for (Employee emp : employee) {
            if (emp.getName().equals(name)) {
                arrayEmp[arrayCounter] = emp;
                arrayCounter++;

            }

        }
        return arrayEmp;
    }


    public Employee[] sortByName() {
        Employee[] emp = new Employee[employee.length];

        for (int i = 0; i < employee.length; i++) {
            int next = i;
            for (int j = i + 1; j < employee.length; j++) {
                if (employee[next].getName().compareTo(employee[j].getName()) > 0) {
                    next = j;
                }
            }
            Employee tempEmp = employee[i];
            employee[i] = employee[next];
            employee[next] = tempEmp;
        }
        return employee;
    }

    public Employee[] sortBySalary() {
        Employee[] emp = new Employee[employee.length];

        for (int i = 0; i < employee.length; i++) {
            int next = i;
            for (int j = i + 1; j < employee.length; j++) {
                if (employee[next].getSalary() > (employee[j].getSalary())) {
                    next = j;
                }
            }
            Employee tempEmp = employee[i];
            employee[i] = employee[next];
            employee[next] = tempEmp;
        }
        return employee;
    }

    public Employee edit(Employee emlForEdit) {
        Long id = emlForEdit.getId();
        Employee currentEmpSave = getById(id);

        for (Employee emp : employee) {
            if (emp.getId() == id) {
                emp = emlForEdit;
                break;

            }


        }
        return currentEmpSave;
    }

    public Employee remove(long removeId) {
        Employee[] arrayEmpl = new Employee[employee.length-1];
        boolean isRemote = false;
        Employee currentEmpForRemove = getById(removeId);
        int counter = 0;

        for (int i = 0; i < employee.length; i++) {
            if(employee[i].getId() == removeId) {
                isRemote = true;
                continue;
            }
            arrayEmpl[counter++] = employee[i];
        }
        if (isRemote) {
            this.employee = arrayEmpl;
            return currentEmpForRemove;
        }
        else
            return null;
    }

    public void addEmp(Employee emlForAdd) {
        Employee[] newArrayEmpl = new Employee[employee.length+1];

        for (int i = 0; i < employee.length; i++) {
              newArrayEmpl[i] = employee[i];
              System.out.println(newArrayEmpl[i]);
            }

        newArrayEmpl[employee.length] = emlForAdd;
        this.employee = newArrayEmpl;
        }



    }
