package com.bootcoding.encapsulation.hospitaal;

import java.util.UUID;

public class Hospital {
   public String name;
   public String address;
   public String services;
   private UUID id;

   public String getName(){
      return name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getServices() {
      return services;
   }

   public void setServices(String services) {
      this.services = services;
   }

   public void setName(String name) {
      this.name = name;
   }

   public UUID getId() {
      return id;
   }

   public void setId(UUID id) {
      this.id = id;
   }
}
