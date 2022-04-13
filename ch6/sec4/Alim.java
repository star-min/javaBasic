package sec4;
//애너테이션 정의
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})		//메서드 호출처럼 활용하려고 할 경우
@Retention(RetentionPolicy.RUNTIME)	//어떤 경우에 사용이 되는지
public @interface Alim {
	String value() default "-";
	int number() default 15;
}