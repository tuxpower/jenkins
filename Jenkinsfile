node {
    checkout scm

    def rootDir = pwd()
    def exampleModule = load "${rootDir}@script/Example.Groovy "
    exampleModule.exampleMethod()
    exampleModule.otherExampleMethod()
}
