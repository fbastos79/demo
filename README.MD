se mettre dans le repertoire demo.
mvn package
docker build -t demo:0.0.1 .
kubectl create -f configmap.yaml
kubectl create -f deployment.yaml
kubectl create -f service.yaml