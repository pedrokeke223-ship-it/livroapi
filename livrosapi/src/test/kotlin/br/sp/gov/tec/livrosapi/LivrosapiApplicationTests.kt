package br.sp.gov.tec.livrosapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LivrosapiApplication

fun main(args: Array<String>) {
	runApplication<LivrosapiApplication>(*args)
}