package com.ghou.scala
package oop

import java.text.SimpleDateFormat
import java.util.Date

/**
 * 工具类
 */
object classDemo03 {

  object DateUtils {
    var sdf:SimpleDateFormat = null

    def strToDate(dateStr: String, temple: String) ={
      sdf = new SimpleDateFormat(temple)
      sdf.parse(dateStr)
    }

    def dateToStr(date:Date, temple: String) ={
      sdf = new SimpleDateFormat(temple);
      sdf.format(date)
    }
  }

  def main(args: Array[String]): Unit = {
    println(DateUtils.dateToStr(new Date(), "yyyy年MM月dd日"))
    val r = DateUtils.strToDate("2021-11-11 10:10:11", "yyyy-MM-dd HH:mm:ssss")
    println(s"时间转日期: ${r}")
  }
}
