public class Main {
    public static void main(String[] args){

        Registry hr = Registry.getRegistry();

        Manager ceo = null;
        try{
            ceo = new Manager("Naruto", "Uzumaki", 2000, 100, 0);
            ceo.printemployee();
            hr.addWorker(ceo);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        employee salesHead = null;
        try{
            salesHead = new employee("Saske", "Uchiha", 1500, ceo.id);
            salesHead.printemployee();
            hr.addWorker(salesHead);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        employee marketingHead = null;
        try{
            marketingHead = new employee("Sakura", "Haruno", 1500, ceo.id);
            marketingHead.printemployee();
            hr.addWorker(marketingHead);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        employee emp1 = null;
        try{
            emp1 = new employee("Boruto", "Uzumaki", 1000, salesHead.id);
            emp1.printemployee();
            hr.addWorker(emp1);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        ceo.add(salesHead);
        ceo.add(marketingHead);

        salesHead.add(emp1);

        System.out.println("\nEmployee List:");
        ceo.printemployee();
        for (employee headEmployee : ceo.getSubordinates()) {
            System.out.print("  ");
            headEmployee.printemployee();

            for (employee emp : headEmployee.getSubordinates()){
                System.out.print("       ");
                emp.printemployee();
            }
        }

    }
}
