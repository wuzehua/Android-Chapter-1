package com.example.hello_world

class DataType
{
    private var textContent: String
    private var imagePath: String

    constructor(text: String, image: String)
    {
        textContent = text
        imagePath = image
    }

    fun getText(): String
    {
        return textContent;
    }

    fun getImagePath(): String
    {
        return imagePath
    }

    fun setText(text: String)
    {
        textContent = text
    }

    fun setImage(image: String)
    {
        imagePath = image
    }

    fun set(text: String, image: String)
    {
        textContent = text
        imagePath = image
    }
}