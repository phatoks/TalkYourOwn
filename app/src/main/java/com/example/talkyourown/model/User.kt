package com.example.talkyourown.model

data class User (val name: String,
                 val bio: String,
                 val profilePicturePath: String?) {
    constructor(): this ("","", null)
}