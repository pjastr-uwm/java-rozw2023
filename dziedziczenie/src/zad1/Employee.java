package zad1;

class Employee extends Person{

        public Employee(String firstName, String lastName) {
            super(firstName, lastName);
        }

        public void displayData() {
            System.out.println("Employee: " + getFirstName() + " " + lastName);
        }

        public static void main(String[] args) {
            Employee employee = new Employee("Jan", "Kowalski");
            employee.displayData();
        }
}
