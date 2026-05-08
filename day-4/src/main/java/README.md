# Proje Senaryosu

Kullanıcı web arayüzünden bir sipariş verir. Bu sipariş Spring Boot üzerinden bir Kafka topic'ine (yemektopic) basılır. Ardından sistemdeki 3 farklı mikroservis (Consumer) bu mesajı alır:

## Mutfak Servisi:
Siparişi hazırlamaya başlar.

## Kurye Servisi: 
Teslimat rotasını belirlemek için adresi alır.

## Kampanya Servisi: 
Sipariş tutarı üzerinden kazanılan bonusu/puanı hesaplar.