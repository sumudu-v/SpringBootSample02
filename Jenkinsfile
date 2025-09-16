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
                echo "Building Application..."
                echo "Application Built..."
            }
        }
        stage('Test') {
            steps {
                echo "Running Tests..."
                echo "Tests Completed Successfully..."
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying Application..."
                echo "Application deployed Successfully..."
            }
        }
    }

    post {
        success {
            echo "Build Successful..."
        }
        failure {
            echo "Build Failed..."
        }
    }
}
