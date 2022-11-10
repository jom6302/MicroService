package com.destinyscrew.orderservice.repository;

import com.destinyscrew.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
