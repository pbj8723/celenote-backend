package com.doubled.celenote.domain.user

import jakarta.persistence.*

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = 0


)
