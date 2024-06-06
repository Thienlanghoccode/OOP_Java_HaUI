
package Learn_oop_p3;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    public int getSalary(){
        return super.getSalary() + this.bonus;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }

}
