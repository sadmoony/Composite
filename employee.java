import java.util.ArrayList;
import java.util.List;

public class employee {
    protected int id;
    protected static int nextid = 0;
    protected String name;
    protected String surname;
    protected double salary;
    protected int managerId;

    protected List<employee> subordinates;

    public employee() {}

    public employee(String name, String surname, double salary, int managerId) throws FieldLengthLimitException, IncorrectSalaryException, EmployeeInRegistryException{
        this.id = nextid++;

        if(name.length()>15 || surname.length()>15){
            throw new FieldLengthLimitException("ID" + id + ": Name must be less then 15 symbols");
        } else {
            this.name = name;
            this.surname = surname;
        }

        if(salary <= 0){
            throw new IncorrectSalaryException("ID" + id + ": Salary must be a positive number");
        } else {
            this.salary = salary;
        }

        this.managerId = managerId;
        subordinates = new ArrayList<employee>();
    }

    public List<employee> getSubordinates() {
        return  subordinates;
    }

    public String getName() {
        return name;
    }

    public void add(employee a){
        subordinates.add(a);
    }

    public void remove(employee a){
        subordinates.remove(a);
    }

    void printemployee(){
        System.out.println("ID" + id + ": Name - " + name + "; Surname - " + surname + "; Salary - "+ salary + "; Manager ID: " + managerId);
    }
}
