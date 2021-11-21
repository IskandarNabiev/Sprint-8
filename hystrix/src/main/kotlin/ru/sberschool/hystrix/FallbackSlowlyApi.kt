package ru.sberschool.hystrix

class FallbackSlowlyApi : SlowlyApi {

    override fun getGeneration(): Generation {
        return Generation("fallback")
    }
}


