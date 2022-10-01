import java.util.ArrayList;
import java.util.List;

public class Manager extends employee{
    double bonus;

    public Manager(String name, String surname, double salary, double bonus, int managerId) throws FieldLengthLimitException, IncorrectSalaryException{
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
            this.bonus = bonus;
        }

        this.managerId = managerId;
        this.subordinates = new ArrayList<employee>();
    }

    public void printemployee(){
        System.out.println("ID" + id + ": Name - " + name + "; Surname - " + surname + "; Salary - "+ salary + "; Bonus: " + bonus + "; Manager ID: " + managerId);
    }
}
