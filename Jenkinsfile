pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/sumudu-v/SpringBootSample02'
            }
        }
        stage('Buld') {
            steps {
                sh 'echo "Building Application..."'
                sh 'echo "Application Built..."'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Running Tests..."'
                sh 'echo "Tests Completed Successfully..."'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Deploying Application..."'
                sh 'echo "Application deployed Successfully..."'
            }
        }
    }
}
