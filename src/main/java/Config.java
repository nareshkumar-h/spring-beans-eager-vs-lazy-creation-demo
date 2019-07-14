import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class Config {

	@Lazy
	@Bean	
	public DemoBean demoBean() {
		return new DemoBean();
	}
}
