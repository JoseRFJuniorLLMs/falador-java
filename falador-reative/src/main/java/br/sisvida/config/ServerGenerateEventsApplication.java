package br.sisvida.config;


/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

public class ServerGenerateEventsApplication {
/*
    private static final Logger log = LoggerFactory.getLogger(ServerGenerateEventsApplication.class.getName());

    private static final String TOPIC = "sisvida-topico";
    private static final String BOOTSTRAP_SERVERS = "localhost:9092";
    private static final String CLIENT_ID_CONFIG = "string-consumidor-novo";

    private final KafkaSender<String, String> sender;
    private final SimpleDateFormat dateFormat;

    public ServerGenerateEventsApplication(String bootstrapServers){

        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
        props.put(ProducerConfig.CLIENT_ID_CONFIG, CLIENT_ID_CONFIG);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        SenderOptions<String, String> senderOptions = SenderOptions.create(props);
        sender = KafkaSender.create(senderOptions);

        dateFormat = new SimpleDateFormat("HH:mm:ss:SSS z dd MMM yyyy");

    }

    public void close() {
        sender.close();
    }

   public void generateMessages(String topic, int count, CountDownLatch latch) throws InterruptedException {
        sender.<Integer>send(Flux.range(1, count)
                .map(i -> SenderRecord.create(new ProducerRecord<>(topic, "Key_"+i, "Message_" + i), i)))
                .doOnError(e -> log.error("ENVIO FALIDO", e))
                .subscribe(r -> {
                    RecordMetadata metadata = r.recordMetadata();
                    System.out.printf("MENSAGEM %d ENVIADA COM SUCESSO, topic-partition=%s-%d offset=%d timestamp=%s%n",
                            r.correlationMetadata(),
                            metadata.topic(),
                            metadata.partition(),
                            metadata.offset(),
                            dateFormat.format(new Date(metadata.timestamp())));
                    latch.countDown();
                });
    }


    public static void main(String[] args) throws InterruptedException {
        int count = 20;
        CountDownLatch latch = new CountDownLatch(count);
        ServerGenerateEventsApplication producer = new ServerGenerateEventsApplication(BOOTSTRAP_SERVERS);
        producer.generateMessages(TOPIC, count, latch);
        latch.await(10, TimeUnit.SECONDS);
        producer.close();
    }*/
}