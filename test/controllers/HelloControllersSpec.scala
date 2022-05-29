/*
 * Copyright Ryota Sato, Inc. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.libs.json.Json
import play.api.test.Helpers._
import play.api.test._

class HelloControllerSpec extends PlaySpec with GuiceOneAppPerTest {

  "HelloController GET" must {

    "「/hello」にGETメソッドでアクセスできる" in {
      val request  = FakeRequest(GET, "/hello")
      val response = route(app, request).get

      status(response) mustBe OK
      contentType(response) mustBe Some("text/plain")
      contentAsString(response) mustBe "Hello World"
    }
  }

  "HelloController POST" must {

    "「/hello」にPOSTメソッドでアクセスするとJsonが返る" in {
      val request  = FakeRequest(POST, "/hello")
      val response = route(app, request).get

      status(response) mustBe OK
      contentType(response) mustBe Some("application/json")
      contentAsJson(response) mustBe Json.obj(
        "hello"    -> "world",
        "language" -> "scala"
      )
    }
  }
}
