package br.dev.biraneves;
public class App {

    public static void main(String[] args) {
        
        Customer customer = new Customer();
        customer.registerAddress("Rua 1, 123");
        customer.setCode(1);

        System.out.println(customer.getCode());
        customer.printAddress();
        
    }

}
