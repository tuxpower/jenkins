node {
    checkout scm

    sh '''
        ls -lhrt
    '''

    def rootDir = pwd()
    def exampleModule = load "${rootDir}/Example.Groovy"
    exampleModule.exampleMethod()
    exampleModule.otherExampleMethod()
}
