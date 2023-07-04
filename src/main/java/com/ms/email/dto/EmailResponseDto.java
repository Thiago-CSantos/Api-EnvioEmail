package com.ms.email.dto;

import com.ms.email.models.EmailModel;

import java.time.LocalDateTime;

public record EmailResponseDto(Long id, String ownerRef, String emailFrom, String emailTo, String subject, String text,
                               LocalDateTime sendDateEmail) {
    public EmailResponseDto(EmailModel emailModel) {
        this(emailModel.getEmailId(), emailModel.getOwnerRef(), emailModel.getEmailFrom(), emailModel.getEmailTo(),
                emailModel.getSubject(), emailModel.getText(), emailModel.getSendDateEmail());
    }
}
