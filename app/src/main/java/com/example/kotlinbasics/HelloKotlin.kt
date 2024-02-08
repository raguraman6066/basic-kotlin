package com.example.kotlinbasics

//jet brain use compatible with java - android and web , server side and data science - easy and concise
fun main(){
  //welcome message - ignore by kotlin

  /*
  multiline comment
  it will be ignore by kotlin compiler
  */

//variable and data types
  var name:String="john";//name should contains small letter and no space
  val age=false;//const value
  name="raman"
  var isWorking:Boolean=false;
  var pi:Float=3.14F
  var pi2:Double=3.14
  var myGrade:Char='A'
  println("Hello $name age of"+age )

  //operators
  /*
  * arithmetic + - % / * ++ --
  * relational or comparison >= <= > < !=
  * assignment = += -= *= %= /=
  * conditional operator ?: ternary
  * logical && || !
  *
  * */

  //conditional statement
  if(false){

  }else if(true){

  }

  //switch => when in kotlin
  val day=2
  when(day){
    1->print("one")
    2->print("two")
    else->print("default")

  }
  //loops
var i:Int=1;
  println()
  do{
    println(i)
    i++
  }
  while(i<5)

  //array
  val cars= arrayOf("BMW","Benz","Volvo")
  cars[0]="Bike"//replace
  print(cars[0])
if("Benz" in cars){
  print("Benz is available")
}

  for(car in cars){
    println(car)
  }

  //ranges - finite values
  for(chars in 'a'..'e'){
    println(chars)
  }
}