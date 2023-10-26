package com.doubled.celenote.domain.order

import com.doubled.celenote.domain.market.Market
import com.doubled.celenote.domain.user.User
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany

@Entity
class Order(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null,
    @OneToMany @JoinColumn(name = "product_id")
    var product_id: List<Market>,
    @OneToMany @JoinColumn(name = "cust_id")
    var cust_id: List<User>,
    @Column var quantity: Int,
)
