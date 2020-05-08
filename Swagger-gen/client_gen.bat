rm -r csharp
rm -r java
mkdir csharp
cd csharp
java -jar ../swagger-codegen-cli-2.2.1.jar generate -i http://localhost:8080/v2/api-docs -l csharp
cd ..
mkdir java
cd java
java -jar ../swagger-codegen-cli-2.2.1.jar generate -i http://localhost:8080/v2/api-docs -l java
cd..