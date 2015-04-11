package com.practicingtechie.gist.macros

import scala.language.experimental.macros

object MyReusableService {
  def macroMethod = macro MyMacros.impl
  def regularMethod = println("foobar")
}
