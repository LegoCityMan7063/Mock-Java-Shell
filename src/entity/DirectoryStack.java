// **********************************************************
// Assignment2:

// Student1:
// UTORID user_name: huan1942
// UT Student #: 1006274274
// Author: Carlos Fei Huang
//
// Student2: Kyle Lewis
// UTORID user_name: lewisky2
// UT Student #: 1006113215
// Author: Kyle Lewis
//
// Student3: Glenn Qing Yuan Ye
// UTORID user_name: yeglenn
// UT Student #: 1006102977
// Author: Glenn Qing Yuan Ye
//
// Student4: Youzhang Sun (Mark)
// UTORID user_name: sunyou
// UT Student #: 1005982830
// Author: Youzhang Sun
//
//
// Honor Code: I pledge that this program represents my own
// program code and that I have coded on my own. I received
// help from no one in designing and debugging my program.
// I have also read the plagiarism section in the course info
// sheet of CSC B07 and understand the consequences.
// *********************************************************

package entity;

import java.io.Serializable;
import java.util.Stack;

/**
 * The stack of directories used in the command pushd and popd.
 */
public class DirectoryStack implements Serializable {
//  /**
//   * Single instance of DirectoryStack to be shared
//   */
//  private static DirectoryStack dirStack = null;
//  /**
//   * Stack meant to store all directories from pushd / popd
//   */
//  private static Stack<Directory> s = null;
//
//  /**
//   * Creates a new stack for directories
//   */
//  private DirectoryStack() {
//    s = new Stack<Directory>();
//  }
//
//

  private Stack<Directory> s;
  /**
   * Creates an instance of a <code>this.dirStack<code> if it does not exist
   * 
   * @return <code>dirStack<code>
   *
   */
//  public static DirectoryStack createDirectoryStackInstance() {
//    if (dirStack == null) {
//      dirStack = new DirectoryStack();
//      return dirStack;
//    }
//    return dirStack;
//  }

  public void intializeStack(){
    s = new Stack<>();
  }

  /**
   * Push a directory onto <code>this.s<code>
   * 
   * @param dir directory to be pushd onto <code>this.s<code>
   */
//  public void dirPush(Directory dir) {
//    if (s != null) {
//      s.push(dir);
//    }
//  }
  public void dirPush(Directory dir){
    FileSystem.getInstance().getDirectoryStack().addOntoStack(dir);
  }

  public void addOntoStack(Directory dir){
    s.push(dir);
  }
  public Directory popFromStack(){
    if (s != null && !s.isEmpty()) {
      return s.pop();
    }
    return null;
  }

  /**
   * Pops directory from <code>this.s<code>
   * 
   * @return directory at the top of the stack <code>this.s<code>
   */
//  public Directory dirPop() {
//    if (s != null && !s.isEmpty()) {
//      return s.pop();
//    }
//    return null;
//  }
  public Directory dirPop(){
    return FileSystem.getInstance().getDirectoryStack().popFromStack();
  }

  /**
   * Returns the directory stack.
   * 
   * @return The directory stack.
   */
  public Stack<Directory> getStack() {
//    return s;
    return FileSystem.getInstance().getDirectoryStack().getFileSystemStack();
  }

  public Stack<Directory> getFileSystemStack(){
    return s;
  }
}
