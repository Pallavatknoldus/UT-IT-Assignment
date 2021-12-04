package com.knoldus.request
import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplUnitTest extends AnyFlatSpec {

  val mockedUserValidator = mock[UserValidator]
  val pallavUser: User = User("Pallav","Gupta",22,"knoldus","pallav.gupta@knoldus.com")

  "User" should "be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(pallavUser)) thenReturn(true)
    val result = userImpl.createUser(pallavUser)
    assert(!result.isEmpty)
  }

  "User" should "not be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(pallavUser)) thenReturn(false)
    val result = userImpl.createUser(pallavUser)
    assert(result.isEmpty)
  }

}