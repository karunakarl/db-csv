
pipeline {
    agent none
    stages {
    stage('Testing'){
	parallel{
		stage('unitTesting'){
		steps{
        //sh 'mvn clean verify -DskipITs=true'
        echo 'Skipping UnitTesting'
        }
		}
		
	}
        
    }
    

    }
	
}
