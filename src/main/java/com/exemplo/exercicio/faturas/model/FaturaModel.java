package com.exemplo.exercicio.faturas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "fatura")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @ToString

public class FaturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Pattern(regexp = "\\d{16}", message = "Número do cartão deve conter 16 caracteres")
    private String numeroCartao;

    @NotBlank
    @Size(min = 3, max = 100, message = "Nome deve ter entre e e 100 caracteres")
    private String titular;

    @NotNull
    @DecimalMin(value = "10.0", message = "O valor mínimo é 10 reais")
    @DecimalMax(value = "5000.00", message = "O valor máximo é 5.000")
    private Double valor;

    @NotNull
    @FutureOrPresent(message = "A data de pagamento deve ser a data atual ou futura.")
    private LocalDate dataPagamento;

    @NotBlank
    @Email(message = "Email deve ser válido")
    private String emailContato;
}
