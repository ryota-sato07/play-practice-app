/*
 * Copyright Ryota Sato, Inc. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._

class HelloControllerSpec extends PlaySpec with GuiceOneAppPerTest {

  "HelloController GET" must {

    "「/hello」にGETメソッドでアクセスできる" in {
      val request  = FakeRequest(GET, "/hello")
      val response = route(app, request).get

      status(response) mustBe OK
    }
  }
}
