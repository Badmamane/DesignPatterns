node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      sh "rm -rf test"
      sh "git clone https://github.com/Badmamane/test"
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'M3'
   }
   stage('Build') {
       dir('test') {
         // Run the maven build
        if (isUnix()) {
           sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
        } else {
           bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
        }
     }
   }
   stage('Results') {
       dir ('test') {
          junit '**/target/surefire-reports/TEST-*.xml'
          archive 'target/*.jar'
       }
   }
}