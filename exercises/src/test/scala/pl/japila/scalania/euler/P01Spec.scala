package pl.japila.scalania.euler

import org.specs2.mutable._
import Euler_P01._

class P01Spec extends Specification {
  "P01 solution" should {
    "Find the sum of all the multiples of 3 or 5 below 1000." in {
      solutions2 |> {
        case (name, f) =>
          s"$name is correct" ==> { f(3, 5, 1000) must_== 233168 }
      }
    }
  }
}
