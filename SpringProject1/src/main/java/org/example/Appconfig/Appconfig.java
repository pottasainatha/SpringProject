package org.example.Appconfig;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan("org.example")


public class Appconfig
{
//      @Bean
//    public Alien alien(  Computer com)//@Qualifier("desktop")
//    {
//         Alien obj = new Alien();
//         obj.setAge(25);
//         obj.setCom(com);
//          return  obj;
//    }
//
//
//    @Bean
//    //@Scope("prototype")
//
//    public Desktop desktop()
//    {
//         return  new Desktop();
//    }
//
//
//    @Bean
//    @Primary
//    public Laptop laptop()
//    {
//          return  new Laptop();
//    }
}
