// User function Template for Java
class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return name + " = " + salary;
    }
}

class Solution {
    public List<String> sortRecords(List<String> employee, List<Integer> salary) {
        List<Employee> employees = new ArrayList<>();
        for(int i = 0; i < employee.size(); i++){
            employees.add(new Employee(employee.get(i), salary.get(i)));
        }

 return employees.stream()
        .sorted(Comparator.comparingInt(Employee::getSalary)
        .thenComparing(Employee::getName)).map(Employee::getName).toList();    }
}
