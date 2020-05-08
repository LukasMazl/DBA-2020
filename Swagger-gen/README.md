# Swagger-gen
Tento modul slouží k vygenerování nebo přegenerování clientské části kódu

Pro přegenerování je potřeba spustit 
```bat
client_gen.bat 
```
nebo
```bat
mkdir csharp
cd csharp
java -jar ../swagger-codegen-cli-2.2.1.jar generate -i http://localhost:8080/v2/api-docs -l csharp
cd ..
mkdir java
cd java
java -jar ../swagger-codegen-cli-2.2.1.jar generate -i http://localhost:8080/v2/api-docs -l java

```
<aside class="warning">
    Během generování je potřeba mít zapnutý backend
</aside>
