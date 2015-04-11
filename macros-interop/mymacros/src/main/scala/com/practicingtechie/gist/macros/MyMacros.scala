package com.practicingtechie.gist.macros

import scala.reflect.macros.blackbox.Context
import scala.language.experimental.macros

object MyMacros {
    def impl(c: Context) = {
      import c.universe._
      c.Expr[Unit](q"""println("Hello macro world")""")
    }

    def hello: Unit = macro impl
}
