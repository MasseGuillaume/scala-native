package scala.scalanative.posix.sys

import scala.scalanative.native.Nat._2
import scala.scalanative.native._
import scala.scalanative.posix.sys.types.{dev_t, mode_t}

/**
  * Created by remi on 01/03/17.
  */
@extern
object stat {

  def stat(pathname: CString, buf: Ptr[CStruct13]): CInt = extern
  def fstat(fd: CInt, buf: Ptr[CStruct13]): CInt = extern
  def lstat(pathname: CString, bug: Ptr[CStruct13]): CInt = extern
  def fstatat(dirfd: CInt, pathname: CString, buf: Ptr[CStruct13], flags: CInt): CInt = extern
  def chmod(pathname: CString, mode: mode_t): CInt = extern
  def fchmod(fd: CInt, mode: mode_t): CInt = extern
  def fchmodat(dirfd: CInt, pathname: CString, mode: mode_t, flags: CInt): CInt = extern
  def umask(mask: mode_t): mode_t = extern
  def getumask(): mode_t = extern
  def mkdir(pathname: CString, mode: mode_t): CInt = extern
  def mkdirat(dirfd: CInt, pathname: CString, mode: mode_t): CInt = extern
  def mknod(pathname: CString, mode: mode_t, dev: dev_t): CInt = extern
  def mknodat(dirfd: CInt, pathname: CString, mode: mode_t, dev: dev_t): CInt = extern
  def mkfifo(pathname: CString, mode: mode_t): CInt = extern
  def mkfifoat(dirfd: CInt, pathname: CString, mode: mode_t): CInt = extern
  def utimensat(dirfd: CInt, pathname: CString, times: CArray[CStruct2, _2], flags: CInt): CInt = extern
  def futimens(fd: CInt, times: CArray[CStruct2, _2]): CInt = extern

  // Macros
  @name("scalanative_s_isuid")
  def S_ISUID = extern
  @name("scalanative_s_isgid")
  def S_ISGID = extern
  @name("scalanative_s_isvtx")
  def S_ISVTX = extern
  @name("scalanative_s_irusr")
  def S_IRUSR = extern
  @name("scalanative_s_iwusr")
  def S_IWUSR = extern
  @name("scalanative_s_ixusr")
  def S_IXUSR = extern
  @name("scalanative_s_irgrp")
  def S_IRGRP = extern
  @name("scalanative_s_iwgrp")
  def S_IWGRP = extern
  @name("scalanative_s_ixgrp")
  def S_IXGRP = extern
  @name("scalanative_s_iroth")
  def S_IROTH = extern
  @name("scalanative_s_iwoth")
  def S_WOTH = extern
  @name("scalanative_s_ixoth")
  def S_IXOTH = extern


}
