package scala.scalanative.posix

import scala.scalanative.native._

/**
  * Created by remi on 28/02/17.
  */
object fcntl {


  //Macros

  @name("scalanative_at_fdcw")
  def AT_FDCW: CInt = extern
  @name("scalanative_at_symlink_nofollow")
  def AT_SYMLINK_NOFOLLOW: CInt = extern
  @name("scalanative_at_removedir")
  def AT_REMOVEDIR: CInt = extern
  @name("scalanative_at_symlink_follow")
  def AT_SYMLINK_FOLLOW: CInt = extern
  @name("scalanative_at_no_automount")
  def AT_NO_AUTOMOUNT: CInt = extern
  @name("scalanative_empty_path")
  def AT_EMPTY_PATH: CInt = extern
  @name("scalanative_o_cloexec")
  def O_CLOEXEC: CInt = extern
  @name("scalanative_o_direct")
  def O_DIRECT: CInt = extern
  @name("scalanative_o_nonblock")
  def O_NONBLOCK: CInt = extern

}
