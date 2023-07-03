package com.pk.University_Event_Management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {
    @Id
    private long eventId;
    private String eventName;
    private String locationOfEvent;
    private String date;
    private String startTime;
    private String endTime;
}
