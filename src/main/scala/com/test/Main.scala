package com.test

import com.typesafe.config.ConfigFactory

object Main extends App {

  val config = ConfigFactory.load()

  println(config.getList("ports"))

}
