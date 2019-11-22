pipeline { 
    agent any;
    stages {
        stage('Maven Build') {
            steps {
                sh "mvn -Dmaven.test.skip clean package"
            }
        }
    }
}
