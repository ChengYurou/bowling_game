rm -rf ./src/test/java 
mv ./__answerBranch/src/test/java ./src/test/java
gradle --offline test
