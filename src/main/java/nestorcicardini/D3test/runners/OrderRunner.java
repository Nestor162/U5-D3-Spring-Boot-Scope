package nestorcicardini.D3test.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import nestorcicardini.D3test.configs.MenuConfig;

@Component
@Slf4j

public class OrderRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		log.info("::::::::::::::::::::::: Orders ::::::::::::::::::::::::::");
		configWithAnnotation();

	}

	public static void configWithAnnotation() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				MenuConfig.class);
		log.info(ctx.getBean("Order1").toString());
		log.info(ctx.getBean("Order2").toString());

		ctx.close();
	}

}
