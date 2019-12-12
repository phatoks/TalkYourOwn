package com.example.talkyourown.model

data class ChatChannel(val userIds: MutableList<String>) {
    constructor() : this(mutableListOf())
}