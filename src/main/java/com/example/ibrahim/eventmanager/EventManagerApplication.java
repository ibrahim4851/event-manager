package com.example.ibrahim.eventmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class EventManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventManagerApplication.class, args);
    }

}

/* ------ PROJECT DESCRIPTION -------- */
/*
Verilerinizi yönetmek için bir model olarak bir Event sınıfı oluşturunuz.


Aşağıda Event classının sahip olması gereken fiedler mevcuttur.

etkinlik adı
başlangıç tarihi
bitiş tarihi
kota
katılımcı sayısı


Bu model için, etkinlik ekleme, güncelleme, silme operasyonlarını içeren
bir spring boot restful api örneği beklenmektedir.
Controllerin API isteğine JSON Objesi olarak dönmesi gerekmektedir.
İsteğe karşılık HTTP status kodlarının ayrıca eklenmesi beklenmektedir.
(Örn. Başarılı bir işlem için OK kodu olan 200 dönülebilir.)

 */
