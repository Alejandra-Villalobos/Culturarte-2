package com.grupo04.culturarte.repositories;

import com.grupo04.culturarte.models.entities.QRCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface QRCodeRepository extends JpaRepository<QRCode, UUID> {
    QRCode findQRCodeById(UUID id);
}
