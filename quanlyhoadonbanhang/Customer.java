package quanlyhoadonbanhang;

public class Customer {
    private String address, code, name; 
    public Customer(String address, String code, String name){
        this.address = address; 
        this.code = code; 
        this.name = name; 
    }
    public String getAddress(){
        return address; 
    }
    public String getCode(){
        return code; 
    }
    public String getName(){
        return name; 
    }
    public void setAddress(String address){
        this.address = address; 
    }
    public void setCode(String code){
        this.code = code; 
    }
    public void setName(String name){
        this.name = name; 
    }
}
