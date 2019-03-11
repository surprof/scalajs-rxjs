package rxjs.internal

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSImport, ScalaJSDefined}

@js.native @JSImport("rxjs/internal/util/pipe", JSImport.Default) object util extends js.Object {
  def pipeFromArray[T, R](args: js.Array[T => R]): T => R = js.native
}
