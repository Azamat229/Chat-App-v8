package com.example.chatapp_v8.model

class User(val uid: String, val username: String, val profileImageUrl: String) {
  constructor() : this("", "", "")
}