package com.gmendoza.salonapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<SalonServiceDetail> availableServices;

    @ManyToOne
    private SalonServiceDetail selectedService;

    private String stylistName;
    private LocalDateTime slotFor;
    //private SlotStatus status;
    private LocalDateTime lockedAt;
    private LocalDateTime confirmedAt;
}
