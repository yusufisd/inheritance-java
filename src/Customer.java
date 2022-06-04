public class Customer extends Info{
    String email;

    public void show(Customer customer){
        System.out.println("CUSTOMER\nname: "+customer.name+"\nemail: "+customer.email+"\nage: "+customer.age);
    }
}
