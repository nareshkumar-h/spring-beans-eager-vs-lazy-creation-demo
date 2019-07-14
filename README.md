# spring-beans-eager-vs-lazy-creation-demo


* By default, Spring “application context” eagerly creates and initializes all ‘singleton scoped‘ beans during application startup itself.
* It helps in detecting the bean configuration issues at early stage, in most of the cases. 
* But sometimes, you may need to mark some or all beans to be lazy initialized due to different project requirements.


#### Lazy - Annotation ( on Method )
```
	@Lazy
	@Bean	
	public DemoBean demoBean() {
		return new DemoBean();
	}
```

#### Lazy Annotation ( on Class )
```
@Configuration
@Lazy
public class BeanConfig {

	@Bean	
	public DemoBean demoBean() {
		return new DemoBean();
	}
}
```
