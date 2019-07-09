package com.example.hello_world

enum class Type{ Hot, New, None}

class RankData
{
    private var type: Type
    private var title: String
    private var number: Int

    constructor(type: Type, title: String, number: Int)
    {
        this.type = type
        this.number = number
        this.title = title
    }

    constructor(title: String, number: Int)
    {
        this.type = Type.None
        this.title = title
        this.number = number
    }

    constructor(title: String)
    {
        this.type = Type.None
        this.title = title
        this.number = 0
    }

    fun getType(): Type
    {
        return type
    }

    fun getTitle(): String
    {
        return title
    }

    fun getNumber(): Int
    {
        return number
    }

    fun setNumber(value: Int)
    {
        number = value
    }

    fun setTitle(value: String)
    {
        title = value
    }

    fun setType(value: Type)
    {
        type = value
    }
}