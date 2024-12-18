package com.batta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Data
public class batta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    int id_produit;
    int id_user;
    float prix;
    LocalDateTime date_debut;
}
