package scala.scalanative
package test

import sbt.testing.{EventHandler, Logger, TaskDef}

import scala.sys.process.Process

class Task(override val taskDef: TaskDef) extends sbt.testing.Task {

  println("Bin is at " + sys.props("scala.native.testbinary"))

  override def tags(): Array[String] = Array.empty

  override def execute(eventHandler: EventHandler,
                       loggers: Array[Logger]): Array[sbt.testing.Task] = {
    Process(
      Seq(sys.props("scala.native.testbinary"), taskDef.fullyQualifiedName)).!
    Array.empty
  }

}
