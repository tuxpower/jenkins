#!/usr/bin/env groovy

def exampleMethod() {
 
  cs = com.cloudbees.plugins.credentials.CredentialsStore.getDomains()
  print cs
}
return this
