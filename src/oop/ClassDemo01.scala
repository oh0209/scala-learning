package com.ghou.scala
package oop

object ClassDemo01 {

  class Person(val name: String = "zs",val addr: String = ""){
    def this(arr:Array[String]){
      this(arr(0),arr(1))
    }
  }

  def main(args: Array[String]): Unit = {
    val p = new Person("ls", "gz")
    println(p.addr, p.name)

    val p2 = new Person(Array("ls","beijing"))
    println(p2.name, p2.addr)
  }


}
