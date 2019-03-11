package rxjs6

import rxjs.Observable

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName}

object Operators {
  @js.native
  @JSImport("rxjs/operators/catchError","catchError"/*,"Rx.Observable.prototype.catchError"*/)
  object catchError extends js.Object {
    def apply[T,R](handler: js.Function1[js.Any, Observable[R]]): Observable[T] => Observable[R] = js.native
  }

  @js.native
  @JSImport("rxjs/operators/map","map"/*,"Rx.Observable.prototype.map"*/)
  object map extends js.Object {
    def apply[T,R](handler: js.Function2[T, Int, R]): Observable[T] => Observable[R] = js.native
  }

  @js.native
  @JSImport("rxjs/operators/timeout","timeout"/*,"Rx.Observable.prototype.timeout"*/)
  object timeout extends js.Object {
    def apply[T](timeout: Int): Observable[T] => Observable[T] = js.native
  }
}
