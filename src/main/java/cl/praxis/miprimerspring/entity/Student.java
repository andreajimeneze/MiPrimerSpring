package cl.praxis.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="estudiantes")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // genera el id autoincremental
    @Column(name="id_estudiante") // indica el nombre de la columna en la base de datos
    private long id;
    @Column(name="nombre", nullable = false, length = 50) // not null
    private String name;
    @Column(name="apellido", nullable = false, length = 50)
    private String surname;
    @Column(name="fecha_nacimiento", nullable = true)
    private LocalDate birthDate;
    @Column(nullable = false, length = 100, unique = true)
    private String email;

}
