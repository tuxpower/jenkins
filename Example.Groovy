/*def exampleMethod() {
    //do something
    echo 'zzzzzzzzzzz'
}

def otherExampleMethod() {
    //do something else
    echo 'xx'
}
return this*/

def exampleMethod() {
 
  cs = com.cloudbees.plugins.credentials.CredentialsStore.getDomains()
  print cs
}
return this
