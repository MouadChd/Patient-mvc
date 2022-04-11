package com.emsi.patientmvc;

import com.emsi.patientmvc.entities.Patient;
import com.emsi.patientmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMvcApplication.class, args);
    }

    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Simo",new Date(),false,150));
            patientRepository.save(new Patient(null,"Mohamed",new Date(),false,110));
            patientRepository.save(new Patient(null,"Jingo",new Date(),true,120));
            patientRepository.save(new Patient(null,"Pablo",new Date(),false,130));

            patientRepository.findAll().forEach(p -> {
                System.out.println(p.getNom());
            });
        };
    }
}

}
