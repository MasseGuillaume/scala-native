package scala.scalanative

import native._
import native.Nat.{_2}

import posix.unistd

/**
  * Created by remi on 02/03/17.
  */
object SyscallsSuite extends tests.Suite {

  test("simple pipe") {

    val p = stackalloc[CArray[CInt, _2]]
    val err = unistd.pipe(p)

    assert(err == 0)

    val pid = unistd.fork()

    // http://www2.cs.uregina.ca/~hamilton/courses/330/notes/unix/pipes/pipes.html
    val message = "Hi Mom!"

    if(pid == 0) {
      unistd.write(!p._2, toCString(message), message.length)
    } else {
      val cstr = stackalloc[CChar](32)
      unistd.read(!p._1, cstr, message.length)
      val out = fromCString(cstr)
      println(out)
      assert(out == message)
    }
  }
}
