package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptador {

	@AroundInvoke
	public Object intercepta(InvocationContext context) throws Exception {
		
		long millis = System.currentTimeMillis();
		
		//chamado do método dao
		Object o = context.proceed();
		
		String nameMethod = context.getMethod().getName();
		String nameClass = context.getTarget().getClass().getSimpleName();
		
		System.out.println(nameClass + ", " + nameMethod);
		System.out.println("Tempo gasto " + (System.currentTimeMillis() - millis) + "s");
		
		return o;
	}
}
