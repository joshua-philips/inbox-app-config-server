package io.joshuaphilips.inboxappconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class InboxAppConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InboxAppConfigServerApplication.class, args);
	}

}
