package rxjs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("rxjs", JSImport.Namespace)
object Rx extends js.Object {
  def interval(period: Int = 0): Observable[Int] = js.native
  def zip[T](observable1: Observable[T], observable2: Observable[T]): Observable[js.Array[T]] = js.native
}
