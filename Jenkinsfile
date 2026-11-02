pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building project...'
                sh 'ls -l'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing project...'
                sh 'test -f index.html'
                echo 'Test passed!'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deployment successful!'
            }
        }
    }
}
