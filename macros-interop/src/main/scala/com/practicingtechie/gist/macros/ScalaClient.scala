package com.practicingtechie.gist.macros

object ScalaClient {

  def main(args: Array[String]) = {
    MyReusableService.regularMethod
    MyReusableService.macroMethod
  }

}
