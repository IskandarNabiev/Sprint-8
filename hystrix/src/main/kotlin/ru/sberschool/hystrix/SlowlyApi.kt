package ru.sberschool.hystrix

import feign.RequestLine

interface SlowlyApi {
    @RequestLine("GET /generation/generation-i")
    fun getGeneration(): Generation
}


