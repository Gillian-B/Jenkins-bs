job('Disk Space Check') {
    description 'Check disk space'
    steps {
        shell 'df'
    }
}

job('Daily Dose of Satisfaction') {
    description 'Comfort you when you need it'
    parameters {
    	stringParam('NAME', 'user', 'Username parameter')
    }
    steps {
        shell 'echo "Hello dear ${NAME}!"'
        shell 'date'
        shell 'echo "This is your DDoS number ${BUILD_NUMBER}."'
    }
}
