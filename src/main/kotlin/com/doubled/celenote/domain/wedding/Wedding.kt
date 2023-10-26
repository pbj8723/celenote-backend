package com.doubled.celenote.domain.wedding

import com.doubled.celenote.domain.user.User
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import java.time.LocalDateTime

@Entity
class Wedding(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null,
    @OneToOne @JoinColumn(name = "user_id")
    var user_id: User,
    @OneToOne @JoinColumn(name = "partner_id")
    var partner_id: User,
    @Column var at: LocalDateTime,
    @Column var venue: String,
)
