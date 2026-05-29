package com.example.superheroes

import com.example.superheroes.model.Hero
import com.example.superheroes.R

object HeroesRepository {
    val heroes = listOf(
        Hero(
            nameRes = R.string.hero1_name,
            descriptionRes = R.string.hero1_description,
            imageRes = R.drawable.hero1
        ),
        Hero(
            nameRes = R.string.hero2_name,
            descriptionRes = R.string.hero2_description,
            imageRes = R.drawable.hero2
        ),
        Hero(
            nameRes = R.string.hero3_name,
            descriptionRes = R.string.hero3_description,
            imageRes = R.drawable.hero3
        ),
        Hero(
            nameRes = R.string.hero4_name,
            descriptionRes = R.string.hero4_description,
            imageRes = R.drawable.hero4
        ),
        Hero(
            nameRes = R.string.hero5_name,
            descriptionRes = R.string.hero5_description,
            imageRes = R.drawable.hero5
        ),
        Hero(
            nameRes = R.string.hero6_name,
            descriptionRes = R.string.hero6_description,
            imageRes = R.drawable.hero6
        ),
        Hero(
            nameRes = R.string.hero7_name,
            descriptionRes = R.string.hero7_description,
            imageRes = R.drawable.hero7
        ),
        Hero(
            nameRes = R.string.hero8_name,
            descriptionRes = R.string.hero8_description,
            imageRes = R.drawable.hero8
        )
    )
}