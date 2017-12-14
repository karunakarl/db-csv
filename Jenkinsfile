
pipeline {
    agent none
    stages {
    stage('Testing'){
	parallel{
		stage('unitTesting'){
		steps{
			checkout([$class: 'GitSCM', branches: [[name: '*/master']], browser: [$class: 'Gitiles', repoUrl: ''], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github', url: 'https://github.com/karunakarl/db-csv.git']]])
        echo 'Skipping UnitTesting'
        }
		}
		
	}
        
    }
    

    }
	
}
