package com.doubled.celenote.domain.user

import com.doubled.celenote.domain.base.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = 0,
    @Column
    val username: String,
    @Column
    val password: String,
    @Column
    val name: String,
    @Column
    val phoneNumber: String,
    @Column
    val birthday: String,
    @Column
    val email: String,
    @Column
    val interlock: String,
) : BaseEntity()
