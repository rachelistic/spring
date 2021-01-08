package co.rachel.spex.main.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public final class LogAdvice {
	@Before("execution(* co.mico.spex..*Impl.*(..))")
	// 아스팩트포인트컷(Before) 
	//조인트컷 ..impl이하 여러 패키지중 *impl로 끝나는 클래스를 찾아서  걔가 가지고 있는 모든 메소드
	//가 동작 될때마다 아래 동작을 찍어라 
	public void logBefore() {
		
		System.out.println("동작 !!~~~~~~~~~");
	//이제 aop가 언제 동작될지 위빙작업을 해야해 
	//루트컨텍스트에 aop가 안들어와있기떄문에 , 스프링에서 new 파일 만들기.
		
	}
}
