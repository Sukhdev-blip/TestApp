node{
  stage ('SCM Checkout'){
   git  'https://github.com/Sukhdev-blip/TestApp'
  }
  stage ('Compile-Package'){
    sh 'mvn package'
  }

}
