package structure.librarium.database.entity;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.util.UUID;

@Entity
@Table(name = "autor")
public class AutorEntity extends RepresentationModel<AutorEntity> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_autor;
    private String nome;

    public UUID getId_autor() {
        return id_autor;
    }

    public void setId_autor(UUID id_autor) {
        this.id_autor = id_autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

