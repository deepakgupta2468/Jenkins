pipeline{
    agent any
    tools{
        maven 'maven3.9.6'
    }
    stages{
        stage(‘Build’){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/deepakgupta2468/Jenkins']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t mydocker2468/devops-automation .'   
                }
            }
        }
        stage('Push Docker Image'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'mydocker2468', variable: 'dockerhubpwd')]) {
                        sh 'docker login -u mydocker2468 -p ${dockerhubpwd}'
                        
                        sh 'docker push mydocker2468/devops-automation'
                    }
                }
            }
        }
    }
}