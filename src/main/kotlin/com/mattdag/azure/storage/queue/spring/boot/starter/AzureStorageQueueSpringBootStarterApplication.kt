package com.mattdag.azure.storage.queue.spring.boot.starter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AzureStorageQueueSpringBootStarterApplication

fun main(args: Array<String>) {
	runApplication<AzureStorageQueueSpringBootStarterApplication>(*args)
}
