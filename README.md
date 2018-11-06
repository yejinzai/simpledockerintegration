# simpledockerintegration
Demo of integrating Flume and Spark services using Docker

---
Flume - spool a source directory and dump files to target directory

cd simpleflume 

docker build -t simpleflume .  
(-t means to name the image)

docker run 
-v /simpledockerintegration/simpleflume/source:/opt/flume/source  \
-v /simpledockerintegration/simpleflume/target:/opt/flume/target  \
-t simpleflume
(-v bind a volume)

echo "the quick brown fox says hello to the lazy dog" >> /source/a
echo "the quick brown fox says hello twice to the lazy dog" >> /source/b

----
Spark - use flume target directory as source for the spark job. Spark job does "hello" word count

cd simplespark

sbt package

docker build -t simplespark .

docker run -v /simpledockerintegration/simpleflume/target:/opt/spark/source \
-t simplespark

---- 
Run Flume and Spark jobs in one pipeline

docker-compose up
