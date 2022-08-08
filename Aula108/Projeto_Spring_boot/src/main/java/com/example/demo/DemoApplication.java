package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public CommandLineRunner runner(CryptoRepository repo){

		return (arg) -> {
			repo.save(new Crypto("Bitcoin", "BTC"));
			repo.save(new Crypto("Ethereum","ETH"));
			repo.save(new Crypto("Ethereum Classic","ETC"));
			repo.save(new Crypto("Litecoin","LTC"));
			repo.save(new Crypto("Monero","XMR"));

			System.out.println();
		};
	}
}
