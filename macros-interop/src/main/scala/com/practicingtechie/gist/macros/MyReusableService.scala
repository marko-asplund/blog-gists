package com.practicingtechie.gist.macros

import scala.language.experimental.macros

object MyReusableService {
  def macroMethod: Unit = macro MyMacros.impl
  def regularMethod = println("foobar")
}
