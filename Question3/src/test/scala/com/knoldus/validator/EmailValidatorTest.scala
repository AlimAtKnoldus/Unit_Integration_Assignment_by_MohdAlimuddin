package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {

  val emailValidator: EmailValidator = new EmailValidator()
  "This Email" should "be valid" in {

    val email = "alimuddin@gmail.com"
    assert(emailValidator.emailIdIsValid(email))
  }

  it should "also be valid if written in this way" in {

    val email= "alimuddin@gmail.com.net"
    assert(emailValidator.emailIdIsValid(email))
  }

  it should "not valid if it contains blank spaces" in {

    val email= "alim uddin@gmail.com" //email containing blank space
    assert(!emailValidator.emailIdIsValid(email))

  }

  it should "also not valid if it contains two or more than two dot's" in {

    val email = "alimuddin@gmail...com" // email containing multiple dots.
    assert(!emailValidator.emailIdIsValid(email))
  }

  it should "also invalid if it is not having @ Symbol in it" in {

    val email= "alimuddingmail.com" // @ Symbol not present.
    assert(!emailValidator.emailIdIsValid(email))
  }


}
