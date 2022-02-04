pipeline {
   agent { node { label 'in2npdvepptest1' } }
    parameters {
        string(name: 'NAME', description: 'Please tell me your name')
        choice(name: 'GENDER', choices: ['Male', 'Female'], description: 'Choose Gender')
    }
    environment { 
        DEPLOY_TO = 'production'
    }
   stages {
      stage('Hello') {
         steps {
            script {
                    def name = "${params.NAME}"
                    def gender = "${params.GENDER}"
                    if(gender == "Male") {
                        echo "Mr. $name"    
                    } else {
                        echo "Mrs. $name"
                    }
                    echo "${DEPLOY_TO}"
                }
         }
		 }
         stage("World"){
             steps {
                 def externalMethod = load("s1.groovy")
                 externalMethod.firstTest()
             }
         }
      }
   }

