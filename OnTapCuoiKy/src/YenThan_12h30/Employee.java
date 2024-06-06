
package YenThan_12h30;

public abstract class Employee implements IEmployee{
    protected String name;
    protected int paymentPerHour;

    public Employee() {
    }

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) throws StringFormatException {
        if(name.equals("")){
            throw new StringFormatException();
        } else{
            this.name = name;
        }
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", paymentPerHour=" + paymentPerHour + '}';
    }
    
}
