package com.transportadora.app.model

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

class UserDetailsServiceImp : UserDetailsService {
    override fun loadUserByUsername(email : String): UserDetails {
        TODO()
    }
}