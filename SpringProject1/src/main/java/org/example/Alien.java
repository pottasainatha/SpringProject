package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Alien
{
    @Value("21")
    private  int age ;


    @Qualifier("laptop")
    private Computer com;

   //  Parameterized Constructor
//      public  Alien(int age, Computer com)
//      {
//           this.age = age;
//           this.com=com;
//      }


    public  Alien()
    {
        System.out.println("Object Created");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setting age ");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }
    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code()
     {
         System.out.println("Coding");
             com.compile();
     }
}
