package com.github.oky2abbas.nExt.thirdParty.gson

import com.github.oky2abbas.nExt.singleton.SingletonObject
import com.google.gson.reflect.TypeToken

/*
    @author : naqqdi@gmail.com
    The shortcuts for this file are to work with Json,
     these shortcuts perform Json to POJO conversions.
 */

/*
    @author : naqqdi@gmail.com
    convert jsonArrayString to generic POJO class
 */

fun <T> Any.fromJsonArray(clazz: Class<T>): List<T> {
    val typeOfT = TypeToken.getParameterized(List::class.java, clazz).type
    return SingletonObject.gSon.fromJson(this.toString(), typeOfT)
}

/*
    @author : naqqdi@gmail.com
    convert jsonObjectString to generic POJO class
 */

fun <T> Any.toObject(clazz: Class<T>): T {
    return SingletonObject.gSon.fromJson(this.toString(), clazz)
}

/*
    @author : naqqdi@gmail.com
    convert jsonArrayString to generic POJO class
 */

fun <T> Any.toArrayObject(clazz: Class<T>): List<T> {
    return fromJsonArray(clazz)
}

/*
    @author : naqqdi@gmail.com
    convert any jsonString to generic  POJO class
 */

fun <T> Any.toAnyObject(clazz: Class<T>): T {
    return SingletonObject.gSon.toJson(this).toObject(clazz)
}

/*
    @author : naqqdi@gmail.com
    convert any jsonString to generic Array POJO class
 */

fun <T> Any.toAnyArrayObject(clazz: Class<T>): List<T> {
    return SingletonObject.gSon.toJson(this).toArrayObject(clazz)
}

/*
    @author : naqqdi@gmail.com
    convert POJO class to  jsonString class
 */

fun Any.toJson(): String {
    return SingletonObject.gSon.toJson(this)
}