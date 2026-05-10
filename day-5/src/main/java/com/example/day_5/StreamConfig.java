package com.example.day_5;



import org.apache.kafka.common.serialization.Serdes;

import org.apache.kafka.streams.StreamsBuilder;

import org.apache.kafka.streams.kstream.Consumed;

import org.apache.kafka.streams.kstream.KStream;

import org.apache.kafka.streams.kstream.Produced;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.kafka.annotation.EnableKafkaStreams;

import org.springframework.kafka.support.serializer.JsonSerde;



import java.math.BigDecimal;



@Configuration

@EnableKafkaStreams

public class StreamConfig {



    @Bean



    public KStream<String, MusteriDto> kStream(StreamsBuilder streamsBuilder) {

        System.out.println(">>> Kafka Stream Uygulaması Başlatılıyor...");

        KStream<String, MusteriDto> stream = streamsBuilder.stream("tumIslemler",

                Consumed.with(Serdes.String(), new JsonSerde<>(MusteriDto.class)));



        // Riskli olanları ayır ve "riskliIslemler" topic'ine gönder

        stream.filter((key, value) -> value.getPara().compareTo(new BigDecimal("5000")) > 0)

                .to("riskliIslemler",

                        Produced.with(Serdes.String(), new JsonSerde<>(MusteriDto.class)));



        // Normal olanları ayır ve "normalIslemler" topic'ine gönder

        stream.filter((key, value) -> value.getPara().compareTo(new BigDecimal("5000")) <= 0)

                .to("normalIslemler", Produced.with(Serdes.String(), new JsonSerde<>(MusteriDto.class)));



        return stream;

    }

}