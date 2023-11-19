package com.grupo04.culturarte.services;

import com.grupo04.culturarte.models.dtos.QRCodeDTO;
import com.grupo04.culturarte.models.entities.QRCode;

import java.util.UUID;

public interface QRCodeService {
    UUID save(QRCodeDTO info) throws Exception;
    void update(QRCodeDTO info,UUID id) throws Exception;
    QRCode findById(UUID id);
}
