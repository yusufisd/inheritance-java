public class Main {
    public static void main(String[] args){
        Customer customer= new Customer();
        Employe employe= new Employe();

        employe.name="ahmet cicek";
        employe.age=22;
        employe.salary=5200;

        customer.name="berke";
        customer.age=12;
        customer.email="berke@gmail.com";

        employe.show(employe);
        customer.show(customer);


    }
}
