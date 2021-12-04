package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplIntegrationTest extends AnyFlatSpec {

  val companyName = new CompanyReadDto
  val validateEmail = new EmailValidator
  val userValidator = new UserValidator(companyName,validateEmail)

  val userImpl = new UserImpl(userValidator)

  "User" should "not be created as company does not exists in DB" in {
    val gauravUser: User = User("Gaurav","Raj",28,"Google","gaurav.raj@gmail.com")

    val result = userImpl.createUser(gauravUser)
    assert(result.isEmpty)
  }

  "User" should "not be created as email id is not valid" in {
    val pragatiUser: User = User("Pragati","Aggarwal",23,"Knoldus","pragati.aggarwal@knoldus")

    val result = userImpl.createUser(pragatiUser)
    assert(result.isEmpty)
  }

  "User" should "not be created as company does not exists in DB and email id is not valid" in {
    val nishuUser: User = User("Nishu","Kumari",22,"Microsoft","nishu.kumari@microsoft")

    val result = userImpl.createUser(nishuUser)
    assert(result.isEmpty)
  }

  "User" should "be created" in {
    val pallavUser: User = User("Pallav","Gupta",22,"Knoldus","pallav.gupta@knoldus.com")

    val result = userImpl.createUser(pallavUser)
    assert(!result.isEmpty)
  }

}