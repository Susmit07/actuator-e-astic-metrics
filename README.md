Capturing of application metrics and publishing to elastic index

Steps to configure elastic search and kibana
--------------------------------------------


Elastic Search
--------------

1. curl -L -O https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-5.1.2.tar.gz
2. tar -xvf elasticsearch-5.1.2.tar.gz 

Once unzipped now start and stop the server

1. cd elasticearch-5.1.2
2. ./bin/elasticsearch

URL: http://127.0.0.1:9200

To stop, you can just terminate the process by pressing Ctrl + C

Kibana
------

1. curl -L -O https://artifacts.elastic.co/downloads/kibana/kibana-5.1.2-darwin-x86_64.tar.gz
2. tar -xvf kibana-5.1.2-darwin-x86_64.tar.gz

Once unzipped now start and stop the server

1. In the configuration file, find the elasticsearch.url setting and replace the value with the IP address and port of where Elasticsearch is running.
2. cd kibana-5.1.2-darwin-x86_64/
3. Start Kibana — ./bin/kibana

URL: http://127.0.0.1:5601

To stop, you can just terminate the process by pressing Ctrl + C
