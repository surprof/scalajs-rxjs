import scala.scalajs.js
//     Project: rxjs
//      Module: 
// Description: 

// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package object rxjs {
  /** Pseudo union type representing a value of type T,
   * an Observable of type T, or an RxPromise of type T.
   *
   * @tparam T value type
   */
  type ValOrObs[T] = js.|[T,js.|[Observable[T],js.Promise[T]]]

  @inline def interval(period: Int = 0) = Rx.interval(period)
  @inline def zip[T](o1: Observable[T], o2: Observable[T]) = Rx.zip(o1, o2)
}
