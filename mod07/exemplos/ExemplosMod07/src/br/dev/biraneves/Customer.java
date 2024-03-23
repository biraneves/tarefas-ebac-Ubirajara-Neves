package br.dev.biraneves;

public class Customer {

    private int code;
    private String name;
    private String address;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void registerAddress(String address) {
        setAddress(address);
    }

    public void printAddress() {
        System.out.println(getAddress());
    }
}
