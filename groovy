pipeline
{
    agent any
    stages
    {
        stage('firstjob')
        {
            steps
            {
            echo "hello job1"
        }}
        
        stage('confirm') {
                 steps {
                    input('Do you want to proceed?')
                 }
                 }
        
        stage('secondjob')
        {
            steps
            {
                echo "hello job2"
            }
        }
            
        
    }
}
