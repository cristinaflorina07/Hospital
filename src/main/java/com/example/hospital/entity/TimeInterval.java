package com.example.hospital.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TimeInterval {
    private LocalDateTime start;
    private LocalDateTime end;

    public boolean overlaps(LocalDateTime startTime, LocalDateTime endTime) {
        return start.isBefore(endTime) && end.isAfter(startTime);
}}
