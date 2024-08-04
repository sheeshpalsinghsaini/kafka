# kafka
All about kafka
Creating Producer and Consumer

Steps: 
    1. start zookeeper 
        bin/zookeeper-server-start.sh config/zookeeper.properties
    2. start kafka / kafka broker 
        bin/kafka-server-start.sh config/server.properties
    3. create a topic at advertised.listeners=PLAINTEXT://localhost:9092 port
        * bin/kafka-topics.sh --bootstrap-server localhost:9092 --create --topic myTopic --partitions 1 --replication-factor 1
        * bin/kafka-topics.sh --bootstrap-server localhost:9092 --list
        * bin/kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic myTopic
    4. bin/kafka-console-producer.sh --bootstrap-server localhost:9092 --topic myTopic
    5. bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic myTopic --from-beginning
    6. if we don't create consumer group then kafka create itself a consumer group
            bin/kafka-consumer-groups.sh --bootstrap-server localhost:9092 --list
    7. bin/kafka-consumer-groups.sh --bootstrap-server localhost:9092 --describe --group console-consumer-40797


bin/kafka-topics.sh -bootstrap-server localhost:9092 --list
__consumer_offsets : here kafka cluster have all the information related to consumer group
myTopic

--------------------
    * for new cosumer, kafka create a new consumer group by default.

    * creating consumer in new consumer group
    bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic myTopic --group myConsumerGroup