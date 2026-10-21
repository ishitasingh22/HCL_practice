package org.example.fielddi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Autowired
    private Address address;
//    public void setAddress(Address address){
//        this.address=address;
//    }
    public String displayAddress(){
        return address.getAddress();
    }

}
