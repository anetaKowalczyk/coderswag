package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "£18", "hat01"),
        Product("Devslopes Hat Black", "£20", "hat02"),
        Product("Devslopes Hat White", "£19", "hat03"),
        Product("Devslopes Hat Snapback", "£22", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "£28", "hoodie01"),
        Product("Devslopes Hoodie Red", "£32", "hoodie02"),
        Product("Devslopes Hoodie Gray Hoodie", "£33", "hoodie03"),
        Product("Devslopes Hoodie Black Hoodie", "£30", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "£18", "shirt01"),
        Product("Devslopes Badge Light Gray", "£20", "shirt02"),
        Product("Devslopes Logo Shirt Red", "£22", "shirt03"),
        Product("Devslopes Hustle", "£21", "shirt04"),
        Product("Kickflip Studios", "£17", "shirt0504")
    )
}