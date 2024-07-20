package cl.praxis.miprimerspring;

import cl.praxis.miprimerspring.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiPrimerSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(MiPrimerSpringApplication.class, args);

        Person andrea = new Person("Andrea", "Jiménez", 49);
        System.out.println("Nombre: " + andrea.getName());
        System.out.println("Apellido: " + andrea.getSurname());
        System.out.println("Edad: " + andrea.getAge());
    }
}
