package com.grupo04.culturarte.models.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QRCodeDTO {
    @NotNull(message = "Active can't be empty")
    private Boolean active;

    @NotNull(message = "Ticket Id can't be empty")
    private UUID ticket_id;
}
