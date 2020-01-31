package com.projekt401.jetpack.data

class FakeDatabase private constructor() {
    companion object {
        @Volatile private var instance: FakeDatabase? =  null
        fun getInstance() =
            instance ?: synchronized(this){
                instance ?: FakeDatabase().also { instance = it }
            }

    }
}