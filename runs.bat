set "location=C:\Users\vikashsharma03\eclipse-workspace\Exit_Test_Assignment"
call mvn -f %location%/pom.xml dependency:resolve
call mvn -f %location%/pom.xml compile
call mvn -f %location%/pom.xml test -DtestSuite=testng
pause