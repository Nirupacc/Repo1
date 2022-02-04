def firstTest(){
  echo "First Stage"
}
return [
    firstTest: this.&firstTest,
    
]