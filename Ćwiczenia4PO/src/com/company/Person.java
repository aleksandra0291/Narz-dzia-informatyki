 package com.company;
import java.util.Scanner;

public class Person {
    String surname;
    String name;
    int age;
    Address a1 = new Address("","","");
public Person(String sn, String n, int a, String c, String s, String zc){
    this.surname=sn;
    this.name=n;
    this.age=a;
    this.a1.city=c;
    this.a1.street=s;
    this.a1.zip_code=zc;
}


}
