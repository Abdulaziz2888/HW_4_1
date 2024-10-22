package com.example.hw_4_1

import java.io.Serializable

data class UserModel (
    val name: String,
    val email: String,
    val password: String,
): Serializable