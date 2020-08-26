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
        
        
        
        stage('secondjob')
        {
            steps
            {
                echo "hello job2"
            }
        }
            
        
    }
}
