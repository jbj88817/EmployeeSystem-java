package di.clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.Vehicles.Vehicle;

/**
 * Created by bojiejiang on 7/9/17.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Vehicle aCar = (Vehicle) context.getBean("mrBeansCar");
        aCar.crankIgnition();
    }
}
