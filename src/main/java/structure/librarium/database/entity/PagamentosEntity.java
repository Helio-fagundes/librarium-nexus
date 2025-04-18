package structure.librarium.database.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "pagamentos")
public class PagamentosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_pagamento;
    private Integer id_pedidos;

    public UUID getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(UUID id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public Integer getId_pedidos() {
        return id_pedidos;
    }

    public void setId_pedidos(Integer id_pedidos) {
        this.id_pedidos = id_pedidos;
    }
}
