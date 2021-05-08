package com.example.shimmerapp.utils

import com.example.shimmerapp.data.models.User

object UserProvider {
    fun getUserList(): List<User> {
        return listOf(
            User(
                "Jack Burton",
                "https://cdn2.iconfinder.com/data/icons/font-awesome/1792/user-512.png",
                "Busy"
            ),
            User(
                "Alicia Woods",
                "https://cdn2.iconfinder.com/data/icons/font-awesome/1792/user-512.png",
                "Available"
            ),
            User(
                "Gerard Law",
                "https://cdn2.iconfinder.com/data/icons/font-awesome/1792/user-512.png",
                "Offline"
            ),
            User(
                "Chris Timber",
                "https://cdn2.iconfinder.com/data/icons/font-awesome/1792/user-512.png",
                "Busy"
            ),
            User(
                "George Martin",
                "https://cdn2.iconfinder.com/data/icons/font-awesome/1792/user-512.png",
                "In Meeting"
            ),
            User(
                "Peter Abbey",
                "https://cdn2.iconfinder.com/data/icons/font-awesome/1792/user-512.png",
                "At Work"
            ),
            User(
                "Tim Aiton",
                "https://cdn2.iconfinder.com/data/icons/font-awesome/1792/user-512.png",
                "Do not disturb!"
            ),
            User(
                "Lily Smith",
                "https://cdn2.iconfinder.com/data/icons/font-awesome/1792/user-512.png",
                "Focus Time"
            ),
            User(
                "Davies Wilson",
                "https://cdn2.iconfinder.com/data/icons/font-awesome/1792/user-512.png",
                "Available"
            ),
            User(
                "Sophie Brown",
                "https://cdn2.iconfinder.com/data/icons/font-awesome/1792/user-512.png",
                "Not Available"
            ),
            User(
                "Victoria O'Brien",
                "https://cdn2.iconfinder.com/data/icons/font-awesome/1792/user-512.png",
                "Offline"
            )
        )
    }
}