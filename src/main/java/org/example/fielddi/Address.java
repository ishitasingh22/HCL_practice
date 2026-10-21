package org.example.fielddi;

import org.springframework.stereotype.Component;
//component is a generic term and configuration and controller are specialized and more specific
@Component
public class Address {
    public String getAddress(){
        return "Vasundhara,Ghaziabad";
    }
}
