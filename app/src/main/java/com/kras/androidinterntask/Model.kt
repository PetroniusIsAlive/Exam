package com.kras.androidinterntask

import com.google.gson.annotations.SerializedName
import java.util.*
import kotlin.collections.HashMap

 data class Model(
    val name: String,
    val topLevelDomain: String,
    val alpha2Code: String,
    val alpha3Code: String,
    val callingCodes: String,
    val capital: String,
    val altSpellings: List<String>,
    val region: String,
    val subregion: String,
    val population: Int,
    val latlng: List<Double>,
    val demonym: String,
    val area: Double,
    val gini: Double,
    val timezones: TimeZone,
    val borders: List<String> ,
    val nativeName: String  ,
    val numericCode: String,
    val currencies: Map<String, String>,
    val languages: List<Map<String, String>>,
    val translations: Map<String, String>,
    val flag: String,
    val regionalBlocs: List<Map<String, String>>,
    val cioc: String){




}