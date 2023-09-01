/*def exampleMethod() {
    //do something
}

def otherExampleMethod() {
    //do something else
    echo 'xx'
}
return this*/

package main

import com.cloudbees.plugins.credentials.CredentialsStore

public class Main {

  private CredentialsStore cs
 
  public static void main(String[] args) {
    cs.getDomains()
    print cs
  }
}
