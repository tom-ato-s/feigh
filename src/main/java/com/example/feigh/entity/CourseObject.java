package com.example.feigh.entity;

import java.time.LocalDateTime;
import java.util.Currency;
import java.util.List;

public class CourseObject {
    String disclaimer;
    String license;
    LocalDateTime timestamp;
    String base;
    List<Currency> rates;

    public CourseObject () {
    }

    public CourseObject(String disclaimer, String license, LocalDateTime timestamp, String base, List<Currency> rates) {
        this.disclaimer = disclaimer;
        this.license = license;
        this.timestamp = timestamp;
        this.base = base;
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "CourceObject{" +
                "disclaimer='" + disclaimer + '\'' +
                ", license='" + license + '\'' +
                ", timestamp=" + timestamp +
                ", base='" + base + '\'' +
                ", rates=" + rates +
                '}';
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<Currency> getRates() {
        return rates;
    }

    public void setRates(List<Currency> rates) {
        this.rates = rates;
    }
}

// disclaimer: "https://openexchangerates.org/terms/",
//         license: "https://openexchangerates.org/license/",
//         timestamp: 1449877801,
//         base: "USD",
//         rates: {
//         AED: 3.672538,
//         AFN: 66.809999,
//         ALL: 125.716501,
//         AMD: 484.902502,
//         ANG: 1.788575,
//         AOA: 135.295998,
//         ARS: 9.750101,
//         AUD: 1.390866,
//         /* ... */rate
//         }