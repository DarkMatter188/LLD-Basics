package com.example.addersubtractoratomicinteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Count {
    public AtomicInteger value;

    public Count(AtomicInteger count) {
        this.value = count;
    }

}
