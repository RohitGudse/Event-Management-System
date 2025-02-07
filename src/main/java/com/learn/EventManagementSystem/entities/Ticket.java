package com.learn.EventManagementSystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="tickets")
public class Ticket {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)	
   private int id;
   private String ticketType;
   private float price;
	
   
}

