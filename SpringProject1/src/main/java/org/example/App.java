package org.example;

import org.example.Appconfig.Appconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
          ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);

        Alien obj1 =  (Alien) context.getBean(Alien.class);
      // obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();






        //          ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
//                        Desktop obj =  context.getBean("desktop", Desktop.class);
//                 Desktop dt = context.getBean(Desktop.class);
//                 dt.compile();
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();




//
//        Desktop dt = context.getBean("desktop",Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean("desktop",Desktop.class);
//        dt.compile();




















//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//       // Alien obj =  (Alien) context.getBean("alien");
//       // obj.code();
//      //   Alien obj = new Alien();
//       //  obj.code();
//        Alien obj1 =  (Alien) context.getBean("alien1");
//           //   obj1.setAge(21);
//        System.out.println(obj1.getAge());
//              obj1.code();
//        // obj1.code();
//        Alien obj2 =  (Alien) context.getBean("alien1");
//        //obj2.code();
//     //   System.out.println(obj2.age);
//
//        Desktop obj = (Desktop) context.getBean("com2");
    }
}
