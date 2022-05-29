/*
 * Copyright Ryota Sato, Inc. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package controllers

import javax.inject.Inject
import play.api.mvc._

class HelloController @Inject() (cc: ControllerComponents)
    extends AbstractController(cc) {

  def hello(): Action[AnyContent] = Action(Ok)
}
